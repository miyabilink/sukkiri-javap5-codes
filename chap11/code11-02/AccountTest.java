public class AccountTest {
  void main() {
    testInstantiate();      // （1）インスタンス化テスト
    testTransfer();         // （2）送金テスト
  }
  // 実際にAccountをnewして使ってみるテスト
  private static void testInstantiate() {
    IO.println("Accountをnewできるかテストします");
    Account a = new Account("ミナト", 30000);
    if (!"ミナト".equals(a.owner)) {
      IO.println("失敗！　名義人がおかしい");
    }
    if (30000 != a.zandaka) {
      IO.println("失敗！　残高がおかしい");
    }
    IO.println("テストを終了します");
  }
  private static void testTransfer() {
    /* : */
  }
}