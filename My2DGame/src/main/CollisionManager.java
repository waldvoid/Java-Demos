package main;

import entity.Entity;

public class CollisionManager {
    GamePanel gp;
    public CollisionManager (GamePanel gp) {
        this.gp = gp;
    }
    public void checkTile(Entity entity) {
        int entityLeftWorldX = entity.worldX + entity.solidArea.x;
        int entityRightWorldX = entity.worldX + entity.solidArea.x + entity.solidArea.width;
        int entityTopWorldY =  entity.worldY + entity.solidArea.y;
        int entityDownWorldY = entity.worldY + entity.solidArea.y + entity.solidArea.height;

        // col and row numbers
        int entityLeftCol = entityLeftWorldX / gp.tileSize;
        int entityRightCol = entityRightWorldX / gp.tileSize;
        int entityTopRow = entityTopWorldY / gp.tileSize;
        int entityDownRow = entityDownWorldY / gp.tileSize;

        // we need to check only 2 tiles based on direction
        int tileNum1, tileNum2;

        switch (entity.direction) {
            case "up":
                entityTopRow = (entityTopWorldY - entity.speed) / gp.tileSize;
                tileNum1 = gp.tileManager.mapTileNum[entityLeftCol][entityTopRow];
                tileNum2 = gp.tileManager.mapTileNum[entityRightCol][entityDownRow];
                if (gp.tileManager.tile[tileNum1].collision == true || gp.tileManager.tile[tileNum2].collision == true) {
                    entity.collisionOn = true;
                }
                break;
            case "down":
                entityDownRow = (entityDownWorldY + entity.speed) / gp.tileSize;
                tileNum1 = gp.tileManager.mapTileNum[entityLeftCol][entityDownRow];
                tileNum2 = gp.tileManager.mapTileNum[entityRightCol][entityDownRow];
                if (gp.tileManager.tile[tileNum1].collision == true || gp.tileManager.tile[tileNum2].collision == true) {
                    entity.collisionOn = true;
                }
                break;
            case "left":
                entityLeftCol = (entityLeftWorldX - entity.speed) / gp.tileSize;
                tileNum1 = gp.tileManager.mapTileNum[entityLeftCol][entityTopRow];
                tileNum2 = gp.tileManager.mapTileNum[entityLeftCol][entityDownRow];
                if (gp.tileManager.tile[tileNum1].collision == true || gp.tileManager.tile[tileNum2].collision == true) {
                    entity.collisionOn = true;
                }
                break;
            case "right":
                entityRightCol = (entityRightWorldX + entity.speed) / gp.tileSize;
                tileNum1 = gp.tileManager.mapTileNum[entityRightCol][entityTopRow];
                tileNum2 = gp.tileManager.mapTileNum[entityRightCol][entityDownRow];
                if (gp.tileManager.tile[tileNum1].collision == true || gp.tileManager.tile[tileNum2].collision == true) {
                    entity.collisionOn = true;
                }
                break;

        }
    }

    public int checkObject(Entity entity, boolean player) {
        int index = 999;
        for(int i = 0; i < gp.objects.size(); i++){
            if(gp.objects.get(i) != null) {
                // get entity's solid area position
                entity.solidArea.x = entity.worldX + entity.solidArea.x;
                entity.solidArea.y = entity.worldY + entity.solidArea.y;
                // get objects solid area
                gp.objects.get(i).solidArea.x = gp.objects.get(i).worldX + gp.objects.get(i).solidArea.x;
                gp.objects.get(i).solidArea.y = gp.objects.get(i).worldY + gp.objects.get(i).solidArea.y;

                switch (entity.direction) {
                    case "up":
                        entity.solidArea.y -= entity.speed;
                        // if entity's solid area intersects with objects solid area
                        if(entity.solidArea.intersects(gp.objects.get(i).solidArea)){
                            if(gp.objects.get(i).collision == true) {
                                entity.collisionOn = true;
                            }  // if it's player
                            if(player == true) {
                                index = i;
                            }
                        }
                        break;
                    case "down":
                        entity.solidArea.y += entity.speed;
                        if(entity.solidArea.intersects(gp.objects.get(i).solidArea)){
                            if(gp.objects.get(i).collision == true) {
                                entity.collisionOn = true;
                            }  // if it's player
                            if(player == true) {
                                index = i;
                            }
                        }
                        break;
                    case "left":
                        entity.solidArea.x -= entity.speed;
                        if(entity.solidArea.intersects(gp.objects.get(i).solidArea)){
                            if(gp.objects.get(i).collision == true) {
                                entity.collisionOn = true;
                            }  // if it's player
                            if(player == true) {
                                index = i;
                            }
                        }
                        break;
                    case "right":
                        entity.solidArea.x += entity.speed;
                        if(entity.solidArea.intersects(gp.objects.get(i).solidArea)){
                            if(gp.objects.get(i).collision == true) {
                                entity.collisionOn = true;
                            }  // if it's player
                            if(player == true) {
                                index = i;
                            }
                        }
                        break;
                }
            }
            // resets solid areas because it increments everytime
            entity.solidArea.x = entity.solidAreaDefaultX;
            entity.solidArea.y = entity.SolidAreaDefaultY;
            gp.objects.get(i).solidArea.x = gp.objects.get(i).solidAreaDefaultX;
            gp.objects.get(i).solidArea.y = gp.objects.get(i).solidAreaDefaultY;
        }
        return index;
    }
}
