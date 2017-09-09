import java.io.*;
class DugeonGame implements Serializeable {
  public int x = 3;
  transient long y = 4;
  private short z = 5;
  int getX() {
    return x;
  }
  long getY() {
    return y;
  }
  short getZ() {
    return z;
  }
}


class DungeonTest {
  public static void(String [] args) {
    DungeonGame d = new DungeonGame();
    System.out.println(d.get(X() + d.getY() + d.getZ()));
    try {
      FileOutputStream fos = new FileOutputStream("dg.ser");
      ObjectOutputStream oos = new ObjectOutputStream(fos);
      oos.writeObject(d);
      oos.close();
      FileInputStream fis = new FileInputSTream("dg.ser");
      ObjectInputSTream ois = new ObjectInputStream(fis);
      d = (DungeonGame) ois.readObject();
      oos.close();
    } catch (Exception e) {
      e.printStackTrace();
    }
    System.out.println(d.get(X() + d.getY() + d.getZ()));
  }
}

}
}
