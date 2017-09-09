import javax.sound.midi.*;

public class MiniMiniMusicApp {

  public static void main(String[] args) {
    MiniMiniMusicApp mini = new MiniMiniMusicApp();
    mini.play();
  }

  public void play() {
    try {
      Sequencer player = MidiSystem.getSequencer();
      player.open();
      Sequence seq = new Sequence(Sequence.PPQ, 4);
      Track track = seq.createTrack();

      ShortMessage a = new ShortMessage();
      //message
      a.setMessage(144,1,44,100);
      //imstruction
      MidiEvent noteOn = new Midievent(a,1);
      //midievent
      track.add(noteOn);
      //holds all the midievent objects 

      player.setSequence(seq);

      player.start();
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}
