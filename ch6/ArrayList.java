import java.util.ArrayList;

// ArayList list version
ArrayList<String> myList = new ArrayList<String>();

String a = new String("whoohoo");
myList.add(a);

String b = new String("Frog");
myList.add(b);

int theSize = myList.size();

Object o = mylist.get(1);

myList.remove(1);

boolean isIn = myList.contains(b);


//Regular array version
String[] myList = new String[2];

String a = new String("Whoohoo");
myList[0] = a;
// myList.append(a);

String b = new String("Frog");
myList[0] = b;
// myList.append(b);

int theSize = myList.length();

// myList[1] = null;
// Object o = myList[0];

myList = myList.removeElement(myList, 0);
myList[1] = null;

for (String element : myList) {
  if (element == b) {
    true
  }
}


boolean isIn = false;

for (String item : myList) {
  if (b.equals(item)) {
    isIn = true;
    break;
  }
}
