public class Main {
  void main() {
    IO.println("アサートにわざと失敗します");
    assert 1 == 0;
    IO.println("正常終了します");
  }
}