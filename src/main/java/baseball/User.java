package baseball;

public class User {
    private String number;

    public String getNumber() {
        return number;
    }

    public void getInputNumber() {
        String userInputNumber = InputView.getUserInputNumber();
        if (isValidNumber(userInputNumber)) {
            number = userInputNumber;
        }
    }

    private boolean isValidNumber(String s) {
        return isValidDuplicated(s) && isValidLength(s) && isCorrectNumber(s);
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

    private boolean isValidLength(String number) {
        return number.length() == 3;
    }

}
