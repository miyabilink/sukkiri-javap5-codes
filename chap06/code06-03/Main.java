import java.io.*;

public class Main {
  void main() throws IOException {
    FileOutputStream fos = new FileOutputStream("rpgsave.dat", true);
    fos.write(65);        // 65は2進数で01000001
    fos.flush();
    fos.close();
  }
}