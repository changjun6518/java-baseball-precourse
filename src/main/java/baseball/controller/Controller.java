package baseball.controller;

import baseball.domain.computer.Calculator;
import baseball.domain.computer.Computer;
import baseball.domain.user.User;
import baseball.view.InputView;

public class Controller {
    Computer computer = new Computer();
    User user = new User();
    boolean isReplay = true;
    boolean isDifferent = true;

    public void start() {
        while (isReplay) {
            startNewGame();
        }
    }

    private void startNewGame() {
        computer.generateRandomNumbers();
        while (isDifferent) {
            user.generateUserNumber();
            isDifferent = Calculator.compareNumbers(computer, user);
        }
        replay();
    }

    private void replay() {
        String userReplayNumber = InputView.getUserReplayNumber();
        decideReplay(userReplayNumber);
    }

    private void decideReplay(String userReplayNumber) {
        if (userReplayNumber.equals("1")) {
            isReplay = true;
            isDifferent = true;
        }
        if (userReplayNumber.equals("2")) {
            isReplay = false;
        }
    }
}
