import java.io.*;

public class Main {
  void main() throws IOException {
    String msg = "第1土曜日は資源ゴミの回収です。";
    Reader sr = new StringReader(msg);
    IO.print((char)sr.read());
    IO.print((char)sr.read());
    /* : */
  }
}