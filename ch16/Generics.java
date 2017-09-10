new ArrayList<Song>()


List<Song> songList = new ArrayList<Song>()

void foo(List<Sing> list)

x.foo(songList)


//  generics methods

public class ArrayList<E> extends AbstractList<E> ..
  public boolean add (E o)


  // using a type parameter defined in the class declaration


  public <T extends Animal> void takeThing (ArrayList<T> list)
  //using a type parameter not defined in the class decalration



  public <T extends Animal> void takeThing(ArrayList<T> list)
  //this one is legal- means can pass in a ArrayList object instantiated as animal or animal subtype

  public void takeThing(ArrayList<Animal> list)

  // these 2 things are different
