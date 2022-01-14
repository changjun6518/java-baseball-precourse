package baseball;

import org.junit.jupiter.api.Test;

public class CalculatorTest {
    public CalculatorTest() {
    }

    @Test
    public void compareNumbers() throws Exception {
        // given
        String computerNumber = "123";
        String userNumber = "124";

        // when

        Result result = Calculator.compare(computerNumber, userNumber);

        // then
        System.out.println("result.toString() = " + result.toString());

    }
}