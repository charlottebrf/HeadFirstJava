public void takeAnimals(ArrayList<? extends Animal> animals) {
  for(Animal a: animals) {
    a.eat();
  }
}

// keyword extend here means either extends OR implements depending on the type


public <T extends Animal> void takeThing(ArrayList<T> list)

public void takeThing(ArrayList<? extends Animal> list)

//both of these do the same thing  
