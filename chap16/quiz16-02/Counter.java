public class Counter {
  private long count = 0;
  public void add(long i) {
    IO.println("足し算します");
    this.count += i;
  }
  public void mul(long i){
    IO.println("掛け算します");
    this.count *= i;
  }
}