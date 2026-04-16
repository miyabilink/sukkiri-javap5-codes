import java.net.*;

public class Main {
  void main() throws Exception {
    IO.println("起動完了");
    ServerSocket svSock = new ServerSocket(39648);
    Socket sock = svSock.accept();
    IO.println(sock.getInetAddress() + "から接続");
    sock.getOutputStream().write("WELCOME".getBytes());
    sock.getOutputStream().flush();
    sock.close();
  }
}