// Must be one of these two things

class Book implements Comaprable {
  String title;
  public Book(String t) {
    title = t;
  }
  public int compareTo(Obejct b) {
    Book book = (Book) b;
    return (title.compareTo(book.title));
  }
}

// The element in the list must be of a type that implements Comparable


public class BookCompare implements Comparator<Book> {
  public int compare(Book one, Book two) {
    return (one.title.compareTo(two.title));
  }
}
// You use the TreeSet’s overload constructor that takes a Comparator

//TestTree
BookCompare bCompare = new BookCompare();
Treeset<Book> tree = new TreeSet<Book>(bCompare);
