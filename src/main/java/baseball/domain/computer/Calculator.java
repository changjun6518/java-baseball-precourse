package baseball.domain.computer;

import baseball.domain.user.User;
import baseball.view.OutputView;

public class Calculator {
    public static Result calculate(Computer computer, User user) {
        int strike = 0;
        int ball = 0;
        for (int i = 0; i < 3; i++) {
            if (user.getBy(i) == computer.getBy(i)) {
                strike++;
            } else if (computer.randomNumbers.contain(user.getBy(i))) {
                ball++;
            }
        }
        return new Result(strike, ball);
    }

    public static boolean compareNumbers(Computer computer, User user) {
        Result result = Calculator.calculate(computer, user);
        OutputView.printResult(result);
        return result.getStrike() != 3;
    }
}
