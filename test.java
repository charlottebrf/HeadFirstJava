int size = 27;
// assign 27 to integer var size

String name = "Fido";
// assign 'fido' to string var name

Dog myDog = new Dog(name, size);
// creates a new instance myDog of the Dog class

x = size - 5;
// doesn't assign 22 to var x as x isn't declared

if (x < 15) myDog.bark(8)
// logic statement if x is less than 15 then invoke bark function on myDog instance

while (x > 3) {
  myDog.play();
}
// while x is greater than 3 invoke play function on myDog instance

 int[] numList = {2,4,6,8};
 // assigns the set of numbers to the array of numbers numList
 // int[] numList = new int[] {2,4,6,8}

 System.out.print("Hello");
 // standard output print 'Hello'

 System.out.print("Dog: " + name);
 // standard output print string Dog + var name

 String num = "8";

 int z = Integer.parseInt(num);
 // assigns converted 8 integer to the var z

 try {
   readTheFile("myFile.txt")
 }
 // key word in Java

 catch(FileNotFoundException ex) {
   System.out.print("File not found.")
 }
 // will catch a thrown exception
