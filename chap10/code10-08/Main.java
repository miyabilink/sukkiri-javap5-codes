import com.opencsv.*;

public class Main {
  void main() throws Exception {
    IO.println("スッキリ魔王征伐 ver1.0.0 by minato");
    IO.println("Mavenで鋭意開発中！待て次号！");

    CSVWriter writer = new CSVWriter(new FileWriter("rpgdata.csv"), ',');
    String[] data = {"sukkiri-quest", "1.0.0"};
    writer.writeNext(data);
    writer.close();
  }
}