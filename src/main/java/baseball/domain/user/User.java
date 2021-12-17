package baseball.domain.user;

import baseball.domain.number.Numbers;
import baseball.view.InputView;

public class User {
    Numbers userNumbers;

    public void generateUserNumber() {
        userNumbers = new Numbers();
        String userInputNumber = InputView.getUserInputNumber();
        Validator.check(userInputNumber, userNumbers);
        System.out.println(userNumbers);
    }

    public int getBy(int index) {
        return userNumbers.get(index);
    }
}
