package HaikuAnalysis;
import UI.Menu;

public class HaikuAnalysis {

    Menu menuToAnalysis = new Menu();

    public void vowels() {
        String vowels = "aeiouy";
    }

    public boolean checkingFirstHaikuPoemLine(String inputFirstLine) {
        if () {
                System.out.println("The first line isn't 5 words long, try again");
                return false;
        } else {
            return true;
        }
    }

    public boolean checkingSecondHaikuPoemLine(String inputSecondLine) {

        if (inputSecondLine.split(" ").length != 7) {
            System.out.println("The second line isn't 7 words long, try again");
            return false;
        } else {
            return true;
        }
    }

    public boolean checkingThirdHaikuPoemLine(String inputThirdLine) {

        if (inputThirdLine.split(" ").length != 5) {
            System.out.println("The third line isn't 5 words long, try again");
            return false;

        } else {
            return true;
        }
    }
}

//Syllables 'a','e','i','o','u','y'
//Count the number of vowels in one word
//Don't count double vowels, two vowels in one word (rAIn, brAIn, wain)
//If the last letter in a word is an 'e', it doesn't count as a vowel
//If there isn't a vowel in the word, it counts as a syllable