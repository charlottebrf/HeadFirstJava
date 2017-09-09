public void takeRisk() {
  if (abandonAllHope) {
    throw new BadException();
  }
}

//create a new Exception object & throw it


public void crossFingers() {
  try {
    anObject.takeRisk();
  } catch (BadException ex) {
    System.out.println("Arrghhh!");
    ex.printStackTrace();
  } catch (AnotherBadException ex) {
    System.out.println("Not again!");
    ex.printStackTrace();
  }
  finally {
    uncrossFingers();
  }
  //finally block let's you put all import cleanup code in one place instead of duplicating in both try & catch
}
//if you can't recover from an exception, get a stack trace using the printStackTrace() method inherited by all exceptions
