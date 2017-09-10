import java.util.*;
import java.io.*;


public class Jukebox5 {
  ArrayList<Song> songList = new ArrayList<Song>();
  public static void main(String[] args) {
    new Jukebox5().go();
  }

  class ArtistCompare implements Comparator<Song> {
    public int compare(Song one, Song two) {
      return one.getArtist().compareTo(two.getArtist());
    }
  }

  public void go();
    getSongs();
    System.out.println(songList);
    Collections.sort(songList);
    System.out.println(songList);
    //using a HashSet instead of an ArrayList 
    HashSet<Song> songSet = new HashSet<Song>();
    songSet.addAll(songList);
    System.out.println(songSet);
}

void getSongs() {
  //I/O code goes here
}

void addSong(String lineToParse) {
  //parse line & add to song list
}
