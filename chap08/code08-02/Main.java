import java.net.*;
import java.io.*;

public class Main {
  void main() throws IOException {
    Socket sock = new Socket("dokojava.jp", 80);
    InputStream is = sock.getInputStream();
    OutputStream os = sock.getOutputStream();
    os.write("GET /index.html HTTP/1.0\r\n".getBytes());
    os.write("\r\n".getBytes());
    os.flush();
    InputStreamReader isr = new InputStreamReader(is);
    int i = isr.read();
    while (i != -1) {
      IO.print((char) i);
      i = isr.read();
    }
    sock.close();
  }
}