package baseball.domain;

public class Controller {
    Computer computer = new Computer();
    User user = new User();
    boolean isReplay = true;
    boolean isCompare = true;

    public void start() {
        while (isReplay) {
            computer.generateRandomNumbers();
            while (isCompare) {
                user.generateUserNumber();
                compareNumbers();
            }
            replay();
        }
    }

    private void compareNumbers() {
        Result result = Calculator.calculate(computer, user);
        OutputView.printResult(result);
        if (result.strike == 3) {
            isCompare = false;
        }
    }

    private void replay() {
        String userReplayNumber = InputView.getUserReplayNumber();
        if (userReplayNumber.equals("1")) {
            isReplay = true;
            isCompare = true;
        }
        if (userReplayNumber.equals("2")) {
            isReplay = false;
        }
    }
}
