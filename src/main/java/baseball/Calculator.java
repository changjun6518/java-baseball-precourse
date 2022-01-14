package baseball;

import java.util.List;
import java.util.stream.Collectors;

public class Calculator {

    public static Result compare(String computerNumber, String userNumber) {
        int strike = 0;
        int ball = 0;

        List<Character> chars = makeCharList(computerNumber);

        for (int i = 0; i < 3; i++) {
            if (computerNumber.charAt(i) == userNumber.charAt(i)) {
                strike++;
            } else if (chars.contains(userNumber.charAt(i))) {
                ball++;
            }
        }

        return new Result(strike, ball);
    }

    private static List<Character> makeCharList(String computerNumber) {
        return computerNumber
                .chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors.toList());
    }
}
