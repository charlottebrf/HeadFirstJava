if (foo.equals(bar) && foo.hashCode()  == bar.hashCode()) {
  //both references are referring to either a single object or to two obejcts that are equal
}

//a hashsset uses the object's hashcode value to determine where to put the object in the Set
//also compares the object's hashcode to the hashcode of all the other objects in the HashSet - if there's no matching hascode, the HashSet assumes that this new object is not a duplicate
//you must override the hashcode to make sure the objects have the same value
//two objects with the same hashCode() might not be equal


// Overriden hashCode() & equals()
public boolean equals (Object a song) {
  Song s = (Song) aSong;
  return getTitle().equals(s.getTitle());
}

public int hashCode() {
  return title.hashCode();
}

//string class has an overriden hashCode() method, so you can just return the result of calling hashCode() on the title. Notice how hashCode() & equals() are using the SAME instance variable.
