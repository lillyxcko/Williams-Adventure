package objects;

import javax.imageio.ImageIO;
import java.io.IOException;
import java.util.Objects;

public class OBJ_Key extends SuperObject{

    public OBJ_Key() {
        name = "Key";
        try{
            image = ImageIO.read(Objects.requireNonNull(getClass().getClassLoader().getResourceAsStream("Objects/Key_1.png")));

        } catch (IOException e){
            e.printStackTrace();
        }
    }
}
