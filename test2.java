int x = 3;

String name = "Dirk";

int x = x * 17;

System.out.print("x is " + x);
int double d = Math.random();


while (x > 12) {
  x = x -1;
}


for (int x = 0; x < 10; x = x + 1) {
  System.out.print("x is now " + x);
}

for (int x = 0; x < 10; x++) {
  System.out.print("x is now " + x);
}

for (int number : testArray) {
  number + 1;
}

int[] testArray = {10,20,30};

for (int x = 0; x < testArray.length; x = x + 1) {
  testArray[x] = x + 1;
  System.out.print("x is now " + x);
}

if (x == 10) {
  System.out.print("x must be 10");
} else {
  System.out.print("x isn't 10");
}
if ((x < 3) & (name.equals("Dirk"))) {
  System.out.println("Gently");
}
System.out.print("this line runs no matter what");
