import java.util.ArrayList;
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;

public class Puzzle {
    private String word;
    private String guesses;
    private String shownGuesses;
    private String shownWord;

    public Puzzle() {
        word = "WORDS";  
        shownGuesses = "";
        guesses = "";
        shownWord = "";
    }

    public void show() {
        guessWord();
        wordGuesses();
        System.out.println("Puzzle: " + shownWord);
        System.out.println();
        System.out.println("Guesses: " + shownGuesses);
    }

    public boolean isUnsolved() {
        if (shownWord.equals(word)) return false;
        else return true;
    }

    public boolean makeGuess(String g) {
        g = g.toUpperCase();
        if (!guesses.contains(g)) {
            guesses += g;
            guesses = guesses.toUpperCase();
        }
        guessWord();
        if (word.contains(g)) {
            return true;
        } else {
            return false;
        }
    }

    public String getWord() {
        return word;
    }

    private void guessWord() {
        shownWord = "";
        for (int i = 0; i < word.length(); i++) {
                if (guesses.contains(word.substring(i, i+1))) {
                    shownWord = shownWord + word.substring(i, i+1);
                } else shownWord = shownWord + "_";           
        }
        shownWord = shownWord.toUpperCase();
    }

    private void wordGuesses() {
        shownGuesses = "";
        for (int i = 0; i < guesses.length(); i++) {
            if (i < guesses.length()-1) shownGuesses = shownGuesses + guesses.substring(i, i+1) + ", ";
            else shownGuesses = shownGuesses + guesses.substring(i, i+1);
        }
    }
}
