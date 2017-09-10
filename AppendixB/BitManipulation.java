// Bitwise NOT Operator- flips all bits of a primitive

int x = 10;
x = ~x;


int x = 10;
int y = 6;

// Bitwise AND operator -returns a value whose bits are turned on ony if both bits are turned on
int a = x & y;


//Bitwise OR operator -returns a value whose bits are turned on ony if both bits are turned on only if either of the original bits are turned on
int a = x | y;

//Bitwise XOR(exclusive OR operator)- returns a value whose bits are turned on only if eactly one of the originals bits is turne don

int a = x ^ y;


//Shift operators
int x = 11;

// Right shift operator: >>
int y = x >>2;

// Unassigned right shift operator: >>>
int y = x >>> 2;

// left shift operator: <<
int y = x << 2;



// Strings are immutable
// - Java has to remember loads of different instances of strings


// If you have to do a lot of string manipulation, there's a StringBuilder class

// Wrappers are Immutable - wrapping integers for example
Integer iWrap  = new Integer(42);
// There is no setter method for a wrapper object


// Assertions


assert (height > 0);
//if true - program continues normally
//if false, throw an Ssertion error

assert (height > 0) : "height = " +  height + " weight = " + weight;

// Compile assertions:
javac TestDriveGame.java

// Run with assertuons:
java -ea TestDriveGame


//Linked Invocations

class Foo {
  public static void main(String[] args) {
    new Foo().go();
  }
  void go() {
    //
  }
}


// Static nested classes

public class FooOuter {
  static class BarInner {
    void SayIt() {
      System.out.println("method of a static inner class");
    }
  }
}

class Test {
  public static void main (String[] args) {
    FooOuter.BarInner foo = new FooOuter.BarInner();
    foo.sayIt();
  }
}



//Anonymous inner class


//instead of passing in an object reference, we pass in... the whole new class definition
//we implement the class that implements ACtionListener right where we need it
button.addActionListener(new ActionListener() {
  public void actionPerformed(ActionEvent ev) {
    System.exit(0);
  }
});



// String & StringBuffer/Builder classes have

char charAt(int index);

int (length);

String substring(int start, int end);

String toString();


// To concatenate Strings:

String concat(string);

String append(String);


// The String class has:


String replace(char old, char enw);

String substring(int begin, int end);

char[] toCharArray();

String toLowerCase();

String toUpperCase();

String trim();

String valueOf(Char []);

String valueOf(int i)


// The StringBuffer & StringBuilder classes have:
StringBuilder delete (int start, int end);

StringBuilder insert (int offset, any primitive or a char[]);

StringBuilder replace(int start, int end, String s);

StringBuilder reverse();

void setCharAt(int index, char ch);


// 2.Multidimensional arrays

int[][] a2d = new int [4][2];

int[][] y = new int [2][];
y[0] = new int [3];
y[1] = new int [5];


// 1.Enumerations


public enum Members { JERRY, BOBBY, PHIL };
public Members selectedBandMember;

if (selectedBandMember == Members.JERRY) {
  //
}



// 'if' & 'switch' with enums

Members n = Members.BOBBY;
if (n.equals(Members.JERRY))  System.out.println("Jerrrry!");
id (n == Members.BOBBY) System.out.println("Rat Dog");


Members n = Members.PHIL;
switch (ifName) {
  case JERRY: System.out.println("Make it sing");
  case PHIL: System.out.println("again");
  case BOBBY: System.out.println("and again");
}
