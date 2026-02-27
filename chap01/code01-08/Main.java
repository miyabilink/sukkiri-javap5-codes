import java.util.*;

public class Main {
  void main() {
    List<Account> list = new ArrayList<>();
    Account a1 = new Account();
    Account a2 = new Account();
    a1.number = 200;
    a2.number = 100;
    list.add(a1);
    list.add(a2);

    IO.println("ソート前：");
    for (Account a :list) {
      IO.println(a.number);
    }

    Collections.sort(list);

    IO.println("ソート後：");
    for (Account a :list) {
      IO.println(a.number);
    }
  }
}