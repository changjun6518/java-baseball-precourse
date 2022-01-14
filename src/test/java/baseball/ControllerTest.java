package baseball;

import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

public class ControllerTest {
    public ControllerTest() {
    }

    @Test
    public void flowTest() throws Exception {
        // given
        Computer computer = new Computer();
        User user = new User();
        Controller controller = new Controller(computer, user);
        // when

        String input = "123";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);
//        controller.run();
//      입력 받는 부분 & 반복문 해결해야돼!
    }
}