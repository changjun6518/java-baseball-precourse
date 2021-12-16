package baseball.domain;

public class User {
    Numbers userNumbers;

    public void generateUserNumber() {
        userNumbers = new Numbers();
        String userInputNumber = InputView.getUserInputNumber();
        for (char c : userInputNumber.toCharArray()) {
            if (!Character.isDigit(c)) {
                throw new IllegalArgumentException("1~9의 숫자를 입력해 주세요");
            }
            int eachNumber = Integer.parseInt(String.valueOf(c));
            if (userNumbers.contain(eachNumber)) {
                throw new IllegalArgumentException("중복된 숫자가 있으면 안됩니다!");
            }
            userNumbers.add(eachNumber);
        }
        if (userNumbers.size() != 3) {
            throw new IllegalArgumentException("3자리 숫자를 입력해주세요");
        }
        System.out.println(userNumbers);
    }

    public int getBy(int index) {
        return userNumbers.get(index);
    }
}
