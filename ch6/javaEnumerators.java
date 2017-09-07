import java.util.ArrayList;
class javaEnumerators {
  public static void main( String[] args ) {
    ArrayList<Pen> myList = new ArrayList<Pen>();
    Pen bic = new Pen();
    Pen parker = new Pen();

    myList.add(bic);
    myList.add(parker);
    ArrayList<Pen> oldList = myList;

    int theSize = myList.size();

    boolean isIn = myList.contains(bic);

    int idx = myList.indexOf(parker);

    boolean empty = myList.isEmpty();

    myList.remove(parker);

    System.out.println(oldList);
    System.out.println(theSize);
    System.out.println(isIn);
    System.out.println(idx);
    System.out.println(empty);
    System.out.println(myList);
  }
}
