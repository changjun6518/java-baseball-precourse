package baseball.domain;

import camp.nextstep.edu.missionutils.Randoms;

public class Computer {
    Numbers randomNumbers = new Numbers();

    public void generateRandomNumbers() {
        while (randomNumbers.size() != 3) {
            generateRandomNumber();
        }
        System.out.println(randomNumbers);
    }

    private void generateRandomNumber() {
        Integer integer = RandomGenerator.generateNumber();
        if (!randomNumbers.contain(integer)) {
            randomNumbers.add(integer);
        }
    }

    public int getBy(int index) {
        return randomNumbers.get(index);
    }
}
