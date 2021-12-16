package baseball.view;

import camp.nextstep.edu.missionutils.Console;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class InputView {
    public static String getUserInputNumber() {
        System.out.println("숫자를 입력해 주세요 : ");
        return readLine();
    }

    public static String getUserReplayNumber() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        return readLine();
    }
}
