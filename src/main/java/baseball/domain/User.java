package baseball.domain;

public class User {
    Numbers numbers = new Numbers();

    public void generateUserNumber() {
        String userInputNumber = InputView.getUserInputNumber();
        for (char c : userInputNumber.toCharArray()) {
            if (!Character.isDigit(c)) {
                throw new IllegalArgumentException("1~9의 숫자를 입력해 주세요");
            }
            int eachNumber = Integer.parseInt(String.valueOf(c));
            if (numbers.contain(eachNumber)) {
                throw new IllegalArgumentException("중복된 숫자가 있으면 안됩니다!");
            }
            numbers.add(eachNumber);
        }
        if (numbers.size() != 3) {
            throw new IllegalArgumentException("3자리 숫자를 입력해주세요");
        }
        System.out.println(numbers);
    }
}
