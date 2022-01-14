package baseball;

import java.util.Scanner;

public class InputView {
    private static final Scanner scanner = new Scanner(System.in);

    public static String getUserInputNumber() {
        System.out.print("숫자를 입력해주세요 : ");
        return scanner.next();
    }

    public static String getUserInputReplayNumber() {
        System.out.println("게임을 새로 시작하려면 1, 종료하려면 2를 입력하세요.");
        return scanner.next();
    }
}
