package baseball.domain;

public class Controller {
    Computer computer = new Computer();
    User user = new User();

    public void start() {
        computer.generateRandomNumbers();
        user.generateUserNumber();
        compareNumbers();
    }

    private void compareNumbers() {
        Result result = Calculator.calculate(computer, user);
        OutputView.printResult(result);
    }


}
