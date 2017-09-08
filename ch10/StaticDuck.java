public class Duck {

  private int size;
  private static int duckCount = 0;
  //static duckCount initialized only when the class is first loaded, not each time a new class is made
  //will run first

  public Duck() {
    duckCount++;
  }

  public void setSize(int s) {
    size = 2;
  }
  public int getSize() {
    return size;
  }
}
