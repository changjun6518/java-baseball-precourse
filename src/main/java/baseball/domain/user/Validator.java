package baseball.domain.user;

import baseball.domain.number.Numbers;

public class Validator {
    public static void check(String userInputNumber, Numbers userNumbers) {
        checkEachNumber(userInputNumber, userNumbers);
        checkIsSameSize(userNumbers);
    }

    private static void checkEachNumber(String userInputNumber, Numbers userNumbers) {
        for (char c : userInputNumber.toCharArray()) {
            checkIsDigit(c);
            int eachNumber = Integer.parseInt(String.valueOf(c));
            checkIsDuplicated(eachNumber, userNumbers);
            userNumbers.add(eachNumber);
        }
    }


    private static void checkIsDigit(char c) {
        if (!Character.isDigit(c)) {
            throw new IllegalArgumentException("1~9의 숫자를 입력해 주세요");
        }
    }

    private static void checkIsDuplicated(int eachNumber, Numbers userNumbers) {
        if (userNumbers.contain(eachNumber)) {
            throw new IllegalArgumentException("중복된 숫자가 있으면 안됩니다!");
        }
    }

    private static void checkIsSameSize(Numbers userNumbers) {
        if (userNumbers.size() != 3) {
            throw new IllegalArgumentException("3자리 숫자를 입력해주세요");
        }
    }
}
