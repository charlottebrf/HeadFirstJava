class Objects {

  Dog a = new Dog();
  Cat c = new Cat();

  // equals()
  if (a.equals(c)) {
    System.out.println("true");
  } else {
    System.out.println("false");
  }
  // => false


  //getClass()
  System.out.println(c.getClass());
  // => class cat

  //hashCode()
  System.out.println(c.hasCode());
  // => 820211

  //toString()
  System.out.println(c.toString());
  // => cat@72df78
}
