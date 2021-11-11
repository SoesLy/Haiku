package HaikuAnalysis;
import UI.Menu;

public class HaikuAnalysis {

    Menu menuToAnalysis = new Menu();

    public boolean checkingFirstHaikuPoemLine(String inputFirstLine) {
        if (inputFirstLine.split(" ").length != 5) {
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
