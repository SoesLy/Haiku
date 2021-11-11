import HaikuAnalysis.HaikuAnalysis;
import UI.Menu;

public class HaikuApp {
    private Menu menu = new Menu();
    HaikuAnalysis analysis = new HaikuAnalysis();


    public static void main(String[] args) {

        HaikuApp app = new HaikuApp();

        app.menu.welcome();
        app.menu.rules();
        boolean isFirstLineCorrect = false;
        while (isFirstLineCorrect == false) {
            String inputFirstLine = app.menu.inputFromUserFirstLine();
            if(app.analysis.checkingFirstHaikuPoemLine(inputFirstLine) == true) {
                break;
            }
        }
        boolean isSecondLineCorrect = false;
        while (isSecondLineCorrect == false) {
            String inputSecondLine = app.menu.inputFromUserSecondLine();
            if (app.analysis.checkingSecondHaikuPoemLine(inputSecondLine) == true) {
                break;
            }
        }
        boolean isThirdLineCorrect = false;
        while (isThirdLineCorrect == false) {
            String inputThirdLine = app.menu.inputFromUserThirdLine();
            if (app.analysis.checkingThirdHaikuPoemLine(inputThirdLine) == true) {
                break;
            }
        }
    }
}
