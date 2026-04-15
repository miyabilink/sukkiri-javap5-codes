import java.io.*;
import java.util.*;

public class Main {
  void main() throws Exception {
    Reader fr = new FileReader("c:\\rpgdata.properties");
    Properties p = new Properties();
    p.load(fr);                                 // ファイル内容を読み取る
    String name = p.getProperty("heroName");    // キーを指定し値を取り出す
    String strHp = p.getProperty("heroHp");
    int hp = Integer.parseInt(strHp);
    IO.println("勇者の名前：" + name);
    IO.println("勇者のHP：" + hp);
    fr.close();
  }
}