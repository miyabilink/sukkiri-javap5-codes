import com.fasterxml.jackson.databind.*;
import java.io.*;

public class Main {
  void main() throws Exception {
    ObjectMapper mapper = new ObjectMapper();
    JsonNode root = mapper.readTree(new File("hero.json"));
    JsonNode hero = root.get("hero");
    JsonNode weapon = hero.get("weapon");
    IO.println("名前:" + hero.get("name").textValue());
    IO.println("武器:" + weapon.get("name").textValue());
  }
}