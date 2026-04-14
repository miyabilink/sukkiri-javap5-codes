import java.io.*;

public class Main {
  void main() throws IOException {
    ByteArrayOutputStream baos = new ByteArrayOutputStream();
    baos.write(65);
    baos.write(66);
    byte[] data = baos.toByteArray();
    for (byte b : data) {
      IO.println(b);
    }
  }
}