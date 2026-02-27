public class Main {
  void main() {
    Hero h1 = new Hero("ミナト");
    Sword s = new Sword("はがねの剣");

    h1.setSword(s);
    IO.println("装備：" + h1.getSword().getName());
    IO.println("clone()で複製します");
    Hero h2 = h1.clone();

    IO.println("コピー元の勇者の剣の名前を変更します");
    h1.getSword().setName("ひのきの棒");
    IO.println("コピー元とコピー先の勇者の装備を表示します");
    IO.println("コピー元：" + h1.getSword().getName() + "／コピー先：" + h2.getSword().getName());
  }
}