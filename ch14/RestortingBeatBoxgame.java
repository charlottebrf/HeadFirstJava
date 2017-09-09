public class MyReadInListener implements ActionListener {

  public void actionPerformed(ActionEvent a) {
    boolean[] checkboxState = null;
    try {
      FileInputStream fileIn = new FileInputStream(new File("Checkbox.ser"));
      ObjectInputStream is = new ObjectInputStream(fileIn);
      checkboxState = (boolean[] is.readObject());

    } catch(Exception ex) {ex.printStacktrace();}

    for (int i = 0; i < 256; i++) {
      JCheckBox check = (JCheckBox) checkboxList.get(i);
      if (checkboxState[i]) {
        check.setSelected(true);
      } else {
        check.setSelected(false);
      }
    }
    sequencer.stop();
    buildTrackAndStart();
  }
}
