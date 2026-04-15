import java.util.zip.*;
import java.util.*;
import java.io.*;

public class Main {
  void main() throws IOException {
    try (ZipFile file = new ZipFile("rpg.jar")) {
      for (ZipEntry e : Collections.list(file.entries())) {
        IO.println(e.getName() + "size=" + e.getCompressedSize());
      }
    }
  }
}