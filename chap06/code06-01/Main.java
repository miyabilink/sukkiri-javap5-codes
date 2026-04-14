import java.io.*;

public class Main {
  void main() throws IOException {
    FileWriter fw = new FileWriter("c:\\rpgsave.dat", true);
    fw.write('A');
    fw.flush();
    fw.close();
  }
}