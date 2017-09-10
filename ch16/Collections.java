// adding a collection can sort through Strings
Collections.sort(songList);
System.out.printlin(songList);

// public static <T extends Comparable<? super T>> void sort(List<T> list)
// compareTo()


// Using song objects
ArrayList<Song> songList = new ArrayList<Song>();

Song nextSong = new Song(tokens[0], tokens[1], tokens[2], tokens[3]);
songList.add(nextSong);

// Example of CompareTo
public interface Comparable<T> {
  int compareTo(T o);
}

// example...
class song implements Comparable<Song> {
  Sting title;
  String artist;
  String rating;
  String bmp;

  public int compareTo(Song s) {
    return title.compareTo(s.getTitle());
  }
}// example...
class song implements Comparable<Song> {
  Sting title;
  String artist;
  String rating;
  String bmp;

  public int compareTo(Song s) {
    return title.compareTo(s.getTitle());
  }
}
