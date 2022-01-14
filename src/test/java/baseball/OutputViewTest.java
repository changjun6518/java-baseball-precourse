package baseball;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

public class OutputViewTest {
    final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();
    final PrintStream standardOut;

    public OutputViewTest() {
        this.standardOut = System.out;
    }

    @BeforeEach
    void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @AfterEach
    void tearDown() {
        System.setOut(standardOut);
    }

    @Test
    public void printTest() throws Exception {
        // given
        Result result = new Result(0,0);

        // when
        OutputView.printResult(result);

        // then
        Assertions.assertEquals("낫싱", outputStreamCaptor.toString().trim());

    }
}