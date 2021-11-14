package UI;

import HaikuAnalysis.HaikuAnalysis;
import HaikuAnalysis.HaikuPoem;

import java.util.Scanner;

public class Menu {
    Scanner scanner = new Scanner(System.in);

    public void welcome() {

        System.out.println("Welcome to the Haiku app");
        System.out.println("-------------------------");
    }

    public void rules() {

        System.out.println("Do you want the rules for Haiku poems?\n'yes'/'no' ");
        String HaikuRules = scanner.nextLine();
        if (HaikuRules.equalsIgnoreCase("yes")) {
            System.out.println("A Haiku poem consist only of 3 lines!\nFirst line consist of 5 words!\nSecond line consist of 7 words!\nThird line consist of 5 words");
        }
    }

    public String inputFromUserFirstLine() {

        System.out.println("------------------------");
        System.out.println("First line of the Haiku poem: ");
        String poemFirstLine = scanner.nextLine();
        //Checking//

        return poemFirstLine;
    }

    public String inputFromUserSecondLine() {
        System.out.println("Second line of the Haiku poem: ");
        String poemSecondLine = scanner.nextLine();
        //Checking

        return poemSecondLine;
    }

    public String inputFromUserThirdLine() {
        System.out.println("Third line of the Haiku poem: ");
        String poemThirdLine = scanner.nextLine();
        //Checking//

        return poemThirdLine;
    }

        public void fullPoem() {


    }
}
