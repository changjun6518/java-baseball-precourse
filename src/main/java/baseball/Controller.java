package baseball;

public class Controller {
    private Computer computer;
    private User user;

    public Controller(Computer computer, User user) {
        this.computer = computer;
        this.user = user;
    }

    public void execute() {
        String replayNumber;
        do {
            run();
            user.getInputReplayNumber();
            replayNumber = user.getReplayNumber();
        } while (replayNumber.equals("1"));
        OutputView.printQuit();
    }

    private void run() {
        Result result;
        computer.generateNumber();
        System.out.println(computer.getNumber());
        do {
            user.getInputNumber();
            result = Calculator.compare(computer.getNumber(), user.getNumber());
            OutputView.printResult(result);
        } while (result.getStrike() != 3);

    }
}