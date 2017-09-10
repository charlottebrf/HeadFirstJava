import java.util.*;

public class TestMap {

  public static void main (String[] args) {

    HashMap<String, Integer> scores = new HashMap<String, Integer>();

    scores.put("Katy", 42);
    scores.put("Bert", 32);
    scores.put("Sarah", 62);

    System.out.println(scores);
    System.out.println(scores.get("Bert"));
  }
 }
