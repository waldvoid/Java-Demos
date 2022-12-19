package main;
import entity.Player;
import object.SuperObject;
import tile.TileManager;

import javax.swing.JPanel;
import java.awt.*;
import java.util.ArrayList;

public class GamePanel extends JPanel implements Runnable{
    // game screen of the game

    // screen settings
    final int originalTileSize = 16;  // 16x16 tile characters etc.
    final int scale = 3; // scale pixel by 3

    public final int tileSize = originalTileSize * scale; // 48x48 tile
    public final int maxScreenCol = 16; // 16 tiles horizontally
    public final int maxScreenRow = 12; // 12 tiles vertically
    public final int screenWidth = tileSize * maxScreenCol; // 768 pixels
    public final int screenHeight = tileSize * maxScreenRow; // 576 pixels

    //world settings
    public final int maxWorldCol = 50;
    public final int maxWorldRow = 50;
    public final int worldWidth = tileSize * maxWorldCol;
    public final int worldHeight = tileSize * maxWorldRow;

    // set fps
    int fps = 60;

    KeyHandler keyH = new KeyHandler();
    Thread gameThread;
    public Player player = new Player(this,keyH);
    public TileManager tileManager = new TileManager(this);
    public CollisionManager collisionManager = new CollisionManager(this);
    public ArrayList<SuperObject> objects = new ArrayList<SuperObject>();
    public ObjectManager objectManager = new ObjectManager(this);

    public GamePanel() {
        this.setPreferredSize(new Dimension(screenWidth, screenHeight));
        this.setBackground(Color.black);
        this.setDoubleBuffered(true);
        this.addKeyListener(keyH);
        this.setFocusable(true);

    }
    public void setupGame() {
        objectManager.setObject();
    }


    // instanciate game thread and start thread
    public void startGameThread() {
        gameThread = new Thread(this);
        gameThread.start();
    }
    // implement Runnable method - game loop create

    // Delta gameloop method - more performance efficient on fps
    @Override
        public void run() {
        double drawInterval = 1_000_000_000/fps;
        double delta = 0;
        long lastTime = System.nanoTime();
        long currentTime;
        // check fps
        long timer = 0;
        int drawCount = 0;

        while(gameThread != null) {
            currentTime = System.nanoTime();
            // how much time has passed and update delta
            delta += (currentTime - lastTime) / drawInterval;
            timer += (currentTime - lastTime);
            lastTime = currentTime;

            // if it passes delta repaint frame
            if(delta > 1) {
                update();
                repaint();
                delta--;
                drawCount++;
            }
            if (timer >= 1_000_000_000) {
                System.out.println("FPS" + drawCount);
                drawCount = 0;
                timer = 0;
            }

        }

    }
    // Sleep game loop method - less convinient
//    @Override
//    public void run() {
//        while (gameThread != null) {
//
//
//            // nanoseconds fps calculation we draw screen 60 per second -  0.01666 seconds
//            double drawInterval = 1_000_000_000/fps;
//            double nextDrawTime = System.nanoTime() + drawInterval;
//
//            // computer makes this process too fast we need to set time and check
//            long currenttime = System.nanoTime();
//            long currentTime2 = System.currentTimeMillis();
//
//
////            System.out.println("The game loop is running");
//            // run method workload: (Depending on FPS)
//            // 1. UPDATE: update information such as character positions
//            update();
//            // 2. DRAW: draw the screen with updated information
//            repaint();
//            try {
//            double remainingTime = nextDrawTime - System.nanoTime();
//            // remaining time if below zero it does not need to sleep - protection
//            if (remainingTime <0) {
//                remainingTime = 0;
//            }
//                Thread.sleep((long)remainingTime / 1000000);
//                nextDrawTime += drawInterval;
//            } catch (InterruptedException e) {
//                throw new RuntimeException(e);
//            }
//        }
//    }
    public void update() {
        //calling from player entity
        player.update();
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        Graphics2D g2 = (Graphics2D)g;
        tileManager.draw(g2);
        for (int i = 0; i < objects.size() ; i++) {
            if(objects.get(i) != null) {
                objects.get(i).draw(g2, this);
            }
        }
        player.draw(g2);
        // release system resource with disposing to save memory
        g2.dispose();
    }
}
