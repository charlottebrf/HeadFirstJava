public class MyFirstApp {

  public static void main (String[] args) {
    System.out.println("I Rule!");
    System.out.println("The World");

    int[] testArray = {10,20,30};

    for (int x = 0; x < testArray.length; x = x + 1) {
      testArray[x] = testArray[x] + 1;
    }

    for (int number : testArray) {
      System.out.println(number);
    }
  }
}
