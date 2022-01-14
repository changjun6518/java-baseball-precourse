package baseball;

public class User {
    private String number;
    private String replayNumber;

    public String getNumber() {
        return number;
    }

    public String getReplayNumber() {
        return replayNumber;
    }

    public void getInputNumber() {
        String userInputNumber = InputView.getUserInputNumber();
        if (isValidNumber(userInputNumber)) {
            number = userInputNumber;
        }
    }

    public void getInputReplayNumber() {
        String userInputReplayNumber = InputView.getUserInputReplayNumber();
        if (isValidReplayNumber(userInputReplayNumber)) {
            replayNumber = userInputReplayNumber;
        }
    }

    private boolean isValidNumber(String s) {
        return isValidLength(s) && isValidDuplicated(s) && isCorrectNumber(s);
    }

    private boolean isValidReplayNumber(String s) {
        return isCorrectReplayNumber(s);
    }

    private boolean isValidDuplicated(String s) {
        return s.charAt(0) != s.charAt(1) && s.charAt(1) != s.charAt(2) && s.charAt(0) != s.charAt(2);
    }

    private boolean isCorrectNumber(String s) {
        for (int i = 0; i < 3; i++) {
            if (!Character.isDigit(s.charAt(i))) {
                return false;
            }
            if (s.charAt(i) < '1' || s.charAt(i) > '9') {
                return false;
            }
        }
        return true;
    }

    private boolean isCorrectReplayNumber(String s) {
        if (!Character.isDigit(s.charAt(0))) {
            return false;
        }
        if (s.charAt(0) < '1' || s.charAt(0) > '2') {
            return false;
        }
        return true;
    }

    private boolean isValidLength(String number) {
        return number.length() == 3;
    }
}