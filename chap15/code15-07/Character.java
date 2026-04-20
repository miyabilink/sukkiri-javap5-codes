public abstract class Character {
  protected String name;
  /* : */
  public final void introduce() {
    IO.println("私の名前は、" + this.name + "です。");
    doIntroduce();
    IO.println("よろしくお願いします。");
  }
  protected abstract void doIntroduce();  
}