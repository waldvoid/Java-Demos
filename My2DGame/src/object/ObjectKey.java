package object;

import javax.imageio.ImageIO;
import java.io.IOException;

public class ObjectKey extends SuperObject{
    public ObjectKey() {
        name = "Key";
        try{
            image = ImageIO.read(getClass().getResourceAsStream("/res/object/key.png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
