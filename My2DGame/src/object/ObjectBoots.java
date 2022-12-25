package object;

import javax.imageio.ImageIO;
import java.io.IOException;

public class ObjectBoots extends SuperObject{
    public ObjectBoots() {
        name = "Boot";
        try{
            image = ImageIO.read(getClass().getResourceAsStream("/res/object/boots.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        // if needed a spesific solid size for collision
        // solidArea.x = 5;
    }
}
