public class Main {
  void main() {
    Account a1 = new Account("1732050", AccountType.FUTSU);
    IO.println("口座番号は" + a1.getAccountNo() + "です");
    IO.println("口座種別は" + a1.getAccountType() + "です");
  }
}