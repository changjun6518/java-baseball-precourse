package baseball.domain.computer;

import baseball.domain.user.User;

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
}
