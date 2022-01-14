package baseball;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Arrays;

public class UserTest {

    @Test
    public void getUserInput() throws Exception {
        // given
        User user = new User();

        // when
        String input = "123";
        InputStream in = new ByteArrayInputStream(input.getBytes());
        System.setIn(in);

        user.getInputNumber();
        String userNumber = user.getNumber();

        // then
        Assertions.assertEquals("123", userNumber);

    }

    @Test
    public void validNumber() throws Exception {
        // given
        ArrayList<String> falseNumber = new ArrayList<String>(Arrays.asList("1234", "112", "a2d", "012"));
        User user = new User();
        // when

        //then
        String s = "1234 112 a2d 012";

        InputStream in = new ByteArrayInputStream(s.getBytes());

        System.setIn(in);
        user.getInputNumber();
        String number = user.getNumber();
        Assertions.assertNull(number);
    }

    @Test
    public void validReplayNumber() throws Exception{
        // given
        User user = new User();

        // when
        String s = "3";

        InputStream in = new ByteArrayInputStream(s.getBytes());

        System.setIn(in);

        user.getInputReplayNumber();
        String replayNumber = user.getReplayNumber();


        // then
        Assertions.assertNull(replayNumber);
    }
}