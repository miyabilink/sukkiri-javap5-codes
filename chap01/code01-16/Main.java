public class Main{
  void main() { 
    LoginHistory h = new LoginHistory("USER1", 0, true);
    IO.println("ログインを試みたユーザー名は" + h.user());
  } 
}