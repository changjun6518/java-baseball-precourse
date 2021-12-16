package baseball.domain;

public class OutputView {
    public static void printResult(Result result) {
        int strike = result.strike;
        int ball = result.ball;
        StringBuilder sb = new StringBuilder();
        if (strike == 0 && ball == 0) {
            sb.append("낫싱");
        }
        if (ball != 0) {
            sb.append(ball);
            sb.append("볼");
            sb.append(" ");
        }
        if (strike != 0){
            sb.append(strike);
            sb.append("스트라이크");
        }
        if (strike == 3) {
            sb.append("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
        }
        System.out.println(sb.toString());
    }
}
