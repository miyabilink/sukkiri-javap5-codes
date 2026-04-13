public class Main {
  void main() {
    /* : */ /* 何らかのデータを読み込む処理 */
    boolean isErr = true;
    if (isErr) {
      IO.println("データが壊れています。異常終了します");
      System.exit(1);
    }
    IO.println("正常終了しました");
  }
}