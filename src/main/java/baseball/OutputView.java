package baseball;

public class OutputView {
    public static void printResult(Result result) {
        StringBuilder message = new StringBuilder();
        if (result.getBall() != 0) {
            message.append(result.getBall());
            message.append("볼 ");
        }
        if (result.getStrike() == 3) {
            message.append("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        } else if (result.getStrike() != 0) {
            message.append(result.getStrike());
            message.append("스트라이크");
        }
        if (result.getStrike() == 0 && result.getBall() == 0) {
            message.append("낫싱");
        }
        System.out.println(message.toString());
    }
}
