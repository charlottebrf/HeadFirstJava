public class Duck {
  int size;

  public Duck(int duckSize) {
    System.out.println("Quack");

    size = duckSize;

    System.out.println("size is " + size);
  }
}

public class Duck2 {
  int size;
  public Duck2() {
    size = 27;
    //supply default size
  }

  public Duck2(int duckSize) {
    size = duckSize;
    //use size given if there is one 
  }
}



public class UseADuck {

  public static void main (String[] arsgs) {
    Duck d = new Duck(42);
  }
}
