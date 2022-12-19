package main;


import object.ObjectChest;
import object.ObjectDoor;
import object.ObjectKey;

public class ObjectManager {
    GamePanel gp;
    public ObjectManager (GamePanel gp) {
        this.gp = gp;
    }
    public void setObject() {
        gp.objects.add(0, new ObjectKey());
        gp.objects.get(0).worldX = 23 * gp.tileSize;
        gp.objects.get(0).worldY = 7 * gp.tileSize;

        gp.objects.add(1, new ObjectKey());
        gp.objects.get(1).worldX = 23 * gp.tileSize;
        gp.objects.get(1).worldY = 40 * gp.tileSize;

        gp.objects.add(2, new ObjectKey());
        gp.objects.get(2).worldX = 37 * gp.tileSize;
        gp.objects.get(2).worldY = 7 * gp.tileSize;

        gp.objects.add(3, new ObjectDoor());
        gp.objects.get(3).worldX = 10 * gp.tileSize;
        gp.objects.get(3).worldY = 11 * gp.tileSize;

        gp.objects.add(4, new ObjectDoor());
        gp.objects.get(4).worldX = 23 * gp.tileSize;
        gp.objects.get(4).worldY = 10 * gp.tileSize;

        gp.objects.add(5, new ObjectDoor());
        gp.objects.get(5).worldX = 12 * gp.tileSize;
        gp.objects.get(5).worldY = 22 * gp.tileSize;

        gp.objects.add(6, new ObjectChest());
        gp.objects.get(6).worldX = 10 * gp.tileSize;
        gp.objects.get(6).worldY = 7 * gp.tileSize;
    }
}
