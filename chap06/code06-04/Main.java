import java.io.*;

public class Main {
  void main() {
    FileWriter fw = null;
    try {
      fw = new FileWriter("rpgsave.dat", true);
      fw.write('A');
      fw.flush();
    } catch (IOException e) {
      IO.println("ファイル書き込みエラーです");
    } finally {
      if (fw != null) {
        try {
          fw.close();
        } catch (IOException e2) { }
      }
    }
  }
}