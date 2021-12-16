package baseball.domain;

import camp.nextstep.edu.missionutils.Randoms;

public class RandomGenerator {
    public static Integer generateNumber() {
        return Randoms.pickNumberInRange(1, 9);
    }
}
