// 1. Make the single SimpleDotcom object
// 2. Make a location for it 3 consecutive cells on a single row of 7 virtual cells
// 3. Ask the user for a guess
// 4. Check the guess
// 5. Repeat until dot com is deat
// 6. Tell the user how many guesses it took

// method
// declare
// compute
// while
// get

  public static void main (String[] args) {
    int numOfGuesses = 0;
    GameHelper helper = new GameHelper();

    SimpleDotCom theDotCom = new SimpleDotCom();
    int randomNum = (int) (Math.random() * 5);
    //(int) is a cast forces thing immediately after it to become the type of the cast -math rand returns a double so have to force it to become an int

    int[] locations = (randomNum, randomNum+1, randomNum+2);
    theDotCom.setLocationCells(locations);
    boolean isAlive = true;

    while (isAlive == true) {
      String guess = helper.getUserInput("enter a number");
      String result = theDotCom.checkYourself(guess);
      numOfGuesses++;
      if (result.equals("kill")) {
        isAlive = false;
        System.out.printlin("You took" + numOfGuesses + " gueses");
      }

    }
  }
