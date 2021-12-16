package baseball;

import baseball.domain.Computer;
import baseball.domain.Controller;
import baseball.domain.User;

public class Application {
    public static void main(String[] args) {
        //TODO: 숫자 야구 게임 구현
        Controller controller = new Controller();
        controller.start();

    }
}
