package object;

import main.GamePanel;

import java.awt.*;
import java.awt.image.BufferedImage;


//parent class of all objects
public class SuperObject {
    public BufferedImage image;
    public String name;
    public boolean collision = false;
    public int worldX, worldY;
    public void draw(Graphics2D g2, GamePanel gp) {
        // screenX ve screenY ekranda nerede çizeceğimiz  - bu kısmı anlaması biraz zor tekrar bak
        int screenX = worldX - gp.player.worldX + gp.player.screenX;
        int screenY = worldY - gp.player.worldY + gp.player.screenY;

        // performance optimization, only draw by screen camera size
        if(worldX > gp.player.worldX - gp.player.screenX - gp.tileSize
                && worldX < gp.player.worldX + gp.player.screenX + gp.tileSize
                && worldY > gp.player.worldY - gp.player.screenY - gp.tileSize
                && worldY < gp.player.worldY + gp.player.screenY + gp.tileSize) {
            g2.drawImage(image, screenX, screenY, gp.tileSize, gp.tileSize, null);
        }
    }
}
