class Go {
  public void go() {
    Dog aDog = new Dog();
    Object sameDog = getObject(aDog);
    // Dog sameDog = getObject(aDog); => this doesn't work 
  }

  public Object getObject(Object o) {
    return o;
  }

  class Dog {

  }
}
