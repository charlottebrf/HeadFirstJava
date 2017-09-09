import javax.sound.midi.*;

public class MusicTest1 {

  public void play() {

    try {
      Sequencer sequencer = MidiSystem.getSequencer();
      System.out.println("Successfully got a sequencer");
    } catch(MidiUnavailableException ex) {
      System.out.println("Bummer");
    }
  }
//put risky thing in a try block- otherwise will get a compiler error 

  public static void main(String[] args) {
    MusicTest1 mt = new MusicTest1();
    mt.play;
  }
}
