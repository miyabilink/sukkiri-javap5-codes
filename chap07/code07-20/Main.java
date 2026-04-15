import java.awt.image.*;
import javax.imageio.*;
import java.io.*;

public class Main {
  void main() throws Exception {
    BufferedImage image = ImageIO.read(new File("minato.jpg"));
    try (FileOutputStream fos = new FileOutputStream("minato.png")) {
      ImageIO.write(image, "png", fos);
      fos.flush();
    }
  }
}