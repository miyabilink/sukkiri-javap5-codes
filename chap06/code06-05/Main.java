import java.io.*;

public class Main {
  void main() {
    try (
      FileWriter fw = new FileWriter("rpgsave.dat", true);
    ) {
      fw.write('A');
      fw.flush();
    } catch (IOException e) {
      IO.println("ファイル書き込みエラーです");
    }
  }
}