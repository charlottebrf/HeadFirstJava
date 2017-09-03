int size = 27;
// assign 27 to integer var size

String name = "Fido";
// assign 'fido' to string var name

Dog myDog = new Dog(name, size);
// creates a new instance myDog of the Dog class

x = size - 5;
// subtract 5 from value of size (27) & assign this to already declared var x

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
// Declare string var num & assign 8 to it

 int z = Integer.parseInt(num);
 // assigns converted 8 integer to the var z

 try {
   readTheFile("myFile.txt")
 }
 // key word in Java- try to read the file

 catch(FileNotFoundException ex) {
   System.out.print("File not found.")
 }
 // will catch a thrown exception- see if the thing tried worked or not - if the try didn't work
 // then do the following
