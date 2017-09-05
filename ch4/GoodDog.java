class GoodDog {

  private int size;
  //The instance variable is private

  public int getSize() {
    return size;
  }
  //getter public

  public void setSize(int s) {
    size = s;
  }
  //getter public 

  void bark() {
    if (size > 60) {
      System.out.println("Woof! Woof!");
    } else if (size > 14) {
      System.out.println("Ruff! Ruff!");
    } else {
      System.out.println("Yup! Yup!");
    }
  }
}
