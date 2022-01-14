package baseball;

public class Application {
    public static void main(String[] args) {
        //TODO: 숫자 야구 게임 구현
        User user = new User();
        Computer computer = new Computer();
        Controller controller = new Controller(computer, user);
        controller.execute();
    }
}
