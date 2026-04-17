import java.io.*;
import java.net.*;

public class Main {
  void main() throws IOException {
    URL url = URI.create("https://dokojava.jp").toURL();
    InputStream is = url.openStream();
    InputStreamReader isr = new InputStreamReader(is);
    int i = isr.read();
    while (i != -1) {
      IO.print((char)i);
      i = isr.read();
    }
    isr.close();
  }
}