package baseball;

import baseball.Controller.Controller;

public class Application {
    public static void main(String[] args) {
        Controller game = new Controller();
        game.run();
    }
}
