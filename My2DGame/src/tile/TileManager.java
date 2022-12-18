package tile;

import main.GamePanel;

import javax.imageio.ImageIO;
import java.awt.*;
import java.io.*;

public class TileManager {
    GamePanel gp;
    Tile[] tile;
    int[][] mapTileNum;


    public TileManager(GamePanel gp) {
        this.gp = gp;
        tile = new Tile[10];
        mapTileNum = new int[gp.maxScreenCol][gp.maxScreenRow];
        getTileImage();
        loadMap("/res/mapping/mapping.txt");

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

            file = new File("src/res/tile/water.png");
            fis = new FileInputStream(file);
            tile[2] = new Tile();
            tile[2].image = ImageIO.read(fis);
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
            while (col < gp.maxScreenCol && row < gp.maxScreenRow) {
                // readline reads single text of line
                String line = br.readLine();
                while(col < gp.maxScreenCol) {
                    String numbers[] = line.split(" ");
                    //change string to integer
                    int num = Integer.parseInt(numbers[col]);
                    mapTileNum[col][row] = num;
                    col++;

                } if (col == gp.maxScreenCol) {
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
//            g2.drawImage(tile[0].image, 0, 0, gp.tileSize, gp.tileSize, null);
//            g2.drawImage(tile[1].image, 48, 0, gp.tileSize, gp.tileSize, null);
//            g2.drawImage(tile[2].image, 96, 0, gp.tileSize, gp.tileSize, null);

            int col = 0;
            int row = 0;
            int x = 0;
            int y = 0;
            while(col < gp.maxScreenCol && row < gp.maxScreenRow) {
                // txt'den aldığımız ve arraye koyduğumuz rakamları teker teker çekip while ile yazdıralım
                int tileNum = mapTileNum[col][row];
                g2.drawImage(tile[tileNum].image, x, y, gp.tileSize, gp.tileSize, null);
                col++;
                x += gp.tileSize;
                if (col == gp.maxScreenCol) {
                    col = 0;
                    x = 0;
                    row++;
                    y += gp.tileSize;
                }
            }
//            for (int i = 0; i < mapTileNum.length ; i++) {
//                for (int j = 0; j < mapTileNum[i].length ; j++) {
////                    System.out.println(mapTileNum[i][j]);
//                }
//            }

        }
    }

