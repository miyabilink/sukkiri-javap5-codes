import java.io.*;

public class Main {
  void main() throws IOException {
    FileReader fr = new FileReader("rpgsave.dat");
    IO.println("すべてのデータを読んで表示します");
    int i = fr.read();
    while (i != -1) {
      char c = (char)i;
      IO.print(c);
      i = fr.read();
    }
    IO.println("ファイルの末尾に到達しました");
    fr.close();
  }
}