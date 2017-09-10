import java.util.*;

public class TestGenerics1 {
  public static void main (String[] args) {
    new TestGenerics1().go();
  }

  public void go() {
    AnimalList<Animal> animals = new ArrayList<Animal>();
    animals.add(new Dog());
    animals.add(new Cat());
    animals.add(new Bird());

    takeAnimals(animals); //animals refers to the AnimalList 
  }

  public void takeAnimals(ArrayList<Animal> animals) {
    for (Animal a: animals) {
      a.eat();
    }
  }
}
