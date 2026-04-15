import com.fasterxml.jackson.databind.*;
import java.io.*;

public class Main {
  void main() throws Exception {
    ObjectMapper mapper = new ObjectMapper();
    JsonFileData file = mapper.readValue (new File("hero.json"), JsonFileData.class);
    IO.println("名前:" + file.hero.name);
    IO.println("武器:" + file.hero.weapon.name);
  }
}