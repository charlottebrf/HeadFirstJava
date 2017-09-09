// Handle or declare exceptions


// Handle
try {
  laundry.doLaundry();
} catch(ClothingException cex) {
  //recovery
}


//declare (duck it)



public class Washer {
  Laundry laundry = new Laundry();

  public void foo() throws ClothingException {
    laundry.doLaundry();
    //throws a clothing exception
  }

  public static void main (String[] args) {
    //get an unreported exception- as far as foo() method is concerned throws an exception
    Washer a = new Washer();
    a.foo();
    //ducks the exception - main has to wrap a.foo() in a try/catch or main() has to declare that it too throws a clothing exception
  }
}
