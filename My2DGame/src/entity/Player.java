package entity;

import main.GamePanel;
import main.KeyHandler;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.IOException;

public class Player extends Entity {
    GamePanel gp;
    KeyHandler keyH;
    public final int screenX;
    public final int screenY;
    int hasKey;


    // constructor
    public Player(GamePanel gp, KeyHandler keyH) {
        this.gp = gp;
        this.keyH = keyH;

        // player is at the center of screen
        screenX = gp.screenWidth / 2 - (gp.tileSize/2);
        screenY = gp.screenHeight / 2 - (gp.tileSize/2);
        // collision rectangle
        solidArea = new Rectangle(8, 16, gp.tileSize * 3/4 , gp.tileSize * 3/4);
        solidAreaDefaultX = solidArea.x;
        SolidAreaDefaultY = solidArea.y;
        // whenever it begins start with default values
        setDefaultValues();
        getPlayerImage();
    }

    // set players default settings - we can't handle it in gamepanel too messy
    public void setDefaultValues() {
        worldX = gp.tileSize * 23;
        worldY = gp.tileSize * 21;
        speed = 4;
        direction = "down";
    }
    public void getPlayerImage() {
        try {
            //entity buffered image fill
            up1 = ImageIO.read(getClass().getResourceAsStream("/res/player/hulky_up_1.png"));
            up2 = ImageIO.read(getClass().getResourceAsStream("/res/player/hulky_up_2.png"));
            down1 = ImageIO.read(getClass().getResourceAsStream("/res/player/hulky_down_1.png"));
            down2 = ImageIO.read(getClass().getResourceAsStream("/res/player/hulky_down_2.png"));
            left1 = ImageIO.read(getClass().getResourceAsStream("/res/player/hulky_left_1.png"));
            left2 = ImageIO.read(getClass().getResourceAsStream("/res/player/hulky_left_2.png"));
            right1 = ImageIO.read(getClass().getResourceAsStream("/res/player/hulky_right_1.png"));
            right2 = ImageIO.read(getClass().getResourceAsStream("/res/player/hulky_right_2.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void update() {
        // updating coordinate with key responses
        if(keyH.rightPressed || keyH.downPressed || keyH.upPressed || keyH.leftPressed) {
        if (keyH.upPressed) {
            direction = "up";
        } else if (keyH.downPressed) {
            direction = "down";
        } else if (keyH.leftPressed) {
            direction = "left";
        } else if (keyH.rightPressed) {
            direction = "right";
        }
        // checking tile collision
        collisionOn = false;
        gp.collisionManager.checkTile(this);

        // checking object collision
           int objIndex = gp.collisionManager.checkObject(this, true);
           pickUpObject(objIndex);

        // if collision is false, player can move
            if(collisionOn == false) {
                switch (direction) {
                    case "up": worldY-= speed;
                        break;
                    case "down": worldY+= speed;
                        break;
                    case "left": worldX -= speed;
                        break;
                    case "right": worldX += speed;
                        break;
                }
            }
        spriteCounter++;
        if(spriteCounter > 12) {
            if (spriteNum == 1) {
                spriteNum = 2;
            } else if (spriteNum == 2) {
                spriteNum = 1;
            }
            spriteCounter = 0;
        }
        }
    }

    public void pickUpObject(int i) {
        // if index (i) is not 999 we touched the object but if it's 999 we didnt touch
        if (i != 999){
            String objectName = gp.objects.get(i).name;

            switch(objectName) {
                case "Key":
                    hasKey++;
                    gp.playSoundEffect(7);
                    gp.objects.remove(i);
                    break;
            case "Door":
                if(hasKey > 0) {
                    gp.playSoundEffect(5);
                    gp.objects.remove(i);
                    hasKey--;
                }
                break;
                case "Boot":
                    gp.playSoundEffect(8);
                    speed += 1;
                    gp.objects.remove(i);
                    break;
            }
            System.out.println("You have " + hasKey + " keys");
        }
    }

    public void draw(Graphics2D g2) {
//        //rectangle example test
//        g2.setColor(Color.white);
//        //draw rectengale
//        g2.fillRect(x, y, gp.tileSize, gp.tileSize);

        BufferedImage image = null;

        switch(direction) {
            case "up":
                if (spriteNum == 1) {
                    image = up1;
                }
                if (spriteNum == 2) {
                    image = up2;
                }
                break;
            case "down":
                if (spriteNum == 1) {
                    image = down1;
                }
                if (spriteNum == 2) {
                    image = down2;
                }
                break;
            case "left":
                if (spriteNum == 1) {
                    image = left1;
                }
                if (spriteNum == 2) {
                    image = left2;
                }
                break;
            case "right":
                if (spriteNum == 1) {
                    image = right1;
                }
                if (spriteNum == 2) {
                    image = right2;
                }
                break;
            default:
                System.out.println("Wrong image buffer");
        }
        // screenx ve screeny değişmeyecek oyun boyunca
        g2.drawImage(image, screenX, screenY, gp.tileSize, gp.tileSize, null);

    }

}
