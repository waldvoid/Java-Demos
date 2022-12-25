package entity;

import java.awt.*;
import java.awt.image.BufferedImage;

//superclass for variables
public class Entity {
    public int worldX, worldY;
    public int speed;

    // Image with an accessible buffer of image data
    public BufferedImage up1, up2, down1, down2, left1, left2, right1, right2;
    public String direction;

    // walking animation sprites image 1 -2 change
    public int spriteCounter = 0;
    public int spriteNum = 1;
    public Rectangle solidArea;
    public int solidAreaDefaultX, SolidAreaDefaultY;
    public boolean collisionOn = false;

}
