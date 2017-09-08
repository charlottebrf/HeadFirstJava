class NoahsArk {
Animals[] animals = new Animal[5];

animals[0] = new Dog();
animals[0] = new Cat();
animals[0] = new Wolf();
animals[0] = new Hippo();
animals[0] = new Lion();

for (int i = 0; i < animals.length; i++) {

animals[i].eat();
animals[i].roam();
}


class Vet {
  public void giveShot(Animal a) {
    a.makeNoise();
  }
}


class PetOwner {
  public void start() {
    Vet v = new Vet();
    Dog d = new Dog();
    Hippo h = new Hippo();
    v.giveShot(d);
    v.giveShot(h);
  }
}

//benefit can use the method giveShot() on any animal 
