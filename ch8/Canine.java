abstract class Canine extends Animal {
  public void roam() {}
}

public class MakeCanine {
  public void go() {
    Canine c;
    c = new Dog();
    c = new Canine();
    //as Canine is abstract compiler won't allow you to create a new instance of the class
    c.roam();
  }
}


public abstract void eat();
//example of an abstract method
