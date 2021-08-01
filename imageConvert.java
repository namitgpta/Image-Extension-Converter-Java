import net.sf.image4j.codec.ico.ICOEncoder;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.util.Objects;

/**
 * imageConvert by Namit Gupta
 */
public class imageConvert {
    public static void main(String[] args) {
        String img_name = args[0];
        String ext = args[1];

        if(ext.equals("ico")){
            try {
                BufferedImage image = ImageIO.read(new File("C:/Users/namit/Desktop/" + img_name));
                ICOEncoder.write(image, new File("C:/Users/namit/Desktop/converted.ico"));
                System.out.println("Conversion DONE....");
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Conversion FAILED....");
            }
        }else {
            try {
                BufferedImage image = ImageIO.read(new File("C:/Users/namit/Desktop/" + img_name));
                ImageIO.write(image, ext, new File("C:/Users/namit/Desktop/converted." + ext));
                System.out.println("Conversion DONE....");
            } catch (IOException e) {
                e.printStackTrace();
                System.out.println("Conversion FAILED....");
            }
        }

    }
}