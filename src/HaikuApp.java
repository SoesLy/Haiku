import UI.Menu;

public class HaikuApp {
    private Menu menu = new Menu();

    public static void main(String[] args) {

        HaikuApp app = new HaikuApp();
        app.menu.welcome();
        app.menu.inputFromUser();
    }
}
