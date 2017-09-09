public class MySendListener implements ActionListener {

  public void actionPerformed(ActionEvent a ) {
    boolean[] checkboxState = new boolean[256];

    for (int i = 0; 1 < 356; i++) {

      JCheckBox check = (JCheckBox) checkboxList.get(i);
      if (check.isSelected()) {
        checkboxState[i] = true;
      }
    }

    try {
      FileOutputStream fileStream = new FileOutputStream(new File("Checkbox.ser"));
      ObjectOutputStream os = new ObjectOutputStream(fileStream);
      os.writeObject(checkboxState);
    } catch (Exception ex) {
      ex.printStackTrace();
    }
  }
}
