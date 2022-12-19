package tile;

import main.GamePanel;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.*;

public class TileManager {
    GamePanel gp;
    public Tile[] tile;
    public int[][] mapTileNum;


    public TileManager(GamePanel gp) {
        this.gp = gp;
        tile = new Tile[10];
        mapTileNum = new int[gp.maxWorldCol][gp.maxWorldRow];
        getTileImage();
        loadMap("/res/mapping/avangeWorld1.txt");

    }
    public void getTileImage() {
        try {
            File file = new File("src/res/tile/grass.png");
            FileInputStream fis = new FileInputStream(file);
            tile[0] = new Tile();
            tile[0].image = ImageIO.read(fis);

            file = new File("src/res/tile/wall.png");
            fis = new FileInputStream(file);
            tile[1] = new Tile();
            tile[1].image = ImageIO.read(fis);
            tile[1].collision = true;

            file = new File("src/res/tile/water.png");
            fis = new FileInputStream(file);
            tile[2] = new Tile();
            tile[2].image = ImageIO.read(fis);
            tile[2].collision = true;

            file = new File("src/res/tile/sand.png");
            fis = new FileInputStream(file);
            tile[3] = new Tile();
            tile[3].image = ImageIO.read(fis);

            file = new File("src/res/tile/earth.png");
            fis = new FileInputStream(file);
            tile[4] = new Tile();
            tile[4].image = ImageIO.read(fis);

            file = new File("src/res/tile/tree.png");
            fis = new FileInputStream(file);
            tile[5] = new Tile();
            tile[5].image = ImageIO.read(fis);
            tile[5].collision = true;
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public void loadMap(String mapPath) {
        try {
            InputStream is = getClass().getResourceAsStream(mapPath);
            //buffered reader reads text file
            BufferedReader br = new BufferedReader(new InputStreamReader(is));
            int col = 0;
            int row = 0;
            while (col < gp.maxWorldCol && row < gp.maxWorldRow) {
                // readline reads single text of line
                String line = br.readLine();
                while(col < gp.maxWorldCol) {
                    String numbers[] = line.split(" ");
                    //change string to integer
                    int num = Integer.parseInt(numbers[col]);
                    mapTileNum[col][row] = num;
                    col++;

                } if (col == gp.maxWorldCol) {
                    col = 0;
                    row++;
                }
            }
            //close bufferedreader
            br.close();
        } catch (Exception e) {

        }

    }
        public void draw(Graphics2D g2) {
        // used for checking tile drawing function
//            g2.drawImage(tile[0].image, 0, 0, gp.tileSize, gp.tileSize, null);
//            g2.drawImage(tile[1].image, 48, 0, gp.tileSize, gp.tileSize, null);
//            g2.drawImage(tile[2].image, 96, 0, gp.tileSize, gp.tileSize, null);

            int worldCol = 0;
            int worldRow = 0;

            while(worldCol < gp.maxWorldCol && worldRow < gp.maxWorldRow) {
                // txt'den aldığımız ve arraye koyduğumuz rakamları teker teker çekip while ile yazdıralım
                int tileNum = mapTileNum[worldCol][worldRow];
                // worldX & worldY tüm haritadaki koordinatı
                int worldX = worldCol * gp.tileSize;
                int worldY = worldRow * gp.tileSize;
                // screenX ve screenY ekranda nerede çizeceğimiz  - bu kısmı anlaması biraz zor tekrar bak
                int screenX = worldX - gp.player.worldX + gp.player.screenX;
                int screenY = worldY - gp.player.worldY + gp.player.screenY;

                // performance optimization, only draw by screen camera size
                if(worldX > gp.player.worldX - gp.player.screenX - gp.tileSize
                        && worldX < gp.player.worldX + gp.player.screenX + gp.tileSize
                        && worldY > gp.player.worldY - gp.player.screenY - gp.tileSize
                        && worldY < gp.player.worldY + gp.player.screenY + gp.tileSize) {
                    g2.drawImage(tile[tileNum].image, screenX, screenY, gp.tileSize, gp.tileSize, null);
                }
                worldCol++;

                if (worldCol == gp.maxWorldCol) {
                    worldCol = 0;
                    worldRow++;

                }
            }
            // used for checking for tile drawing
//            for (int i = 0; i < mapTileNum.length ; i++) {
//                for (int j = 0; j < mapTileNum[i].length ; j++) {
////                    System.out.println(mapTileNum[i][j]);
//                }
//            }

        }
    }

