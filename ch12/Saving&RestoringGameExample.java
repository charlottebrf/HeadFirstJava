import java.io.*;

public class GameSaveTest {
  public static void main(String[] args) {
    GameCharacter one = new GameCharacter(50, "Elf", new String[] {"bow", "sword", "dust"});
    GameCharacter two = new GameCharacter(20, "Troll", new String[] {"bare hands", "ax"});

    try {
      ObjectOutputStream os = new ObjectOuputStream(new FileOutPutSTream("Game.ser"));
      os.writeObject(one);
      os.writeObject(two);
      os.close();
    } catch(IOException ex) {
      ex.printStackTrace();
    }
    one = null;
    two = null;

    try {
      ObjectInputStream is = new ObjectInputStream(new FileInputStream("Game.ser"));
      GameCharacter oneRestore = (GameCharacter) is.readObject();
      GameCharacter twoRestore = (GameCharacter) is.readObject();

      System.out.println("One's type: " + oneRestore.getType());
      System.out.println("Two's type: " + twoRestore.getType());
    } catch(Exception ex) {
      ex.printStackTrace();
  }
}
