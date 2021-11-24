public class HangingMan {

    private int numWrongGuesses;
    String[] HangmanImage = {"(    )",

                                "(  □ )",
                            
                                "( °□ )",
                            
                                "( °□°)",
                                
                                
                                "(╯°□°)",
                                
                                
                                "(╯°□°)╯︵",
                                
                                
                                "(╯°□°)╯︵ ┻━┻",
                            };
                            
            public HangingMan() {
                numWrongGuesses = 0;
            }
            
            public void show() {
                System.out.println(HangmanImage[numWrongGuesses]);
            }
            
            public void dieSomeMore() {
                numWrongGuesses++;
            }
            
            public boolean isntDead() {
                return numWrongGuesses < HangmanImage.length;
            }
}
