package baseball;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

class ApplicationTest {

    @Test
    public void generateComputerNumber() throws Exception{
        // given
        Computer computer = new Computer();
        computer.generateNumber();

        // when
        String computerNumber = computer.getNumber();


        // then
        System.out.println("computerNumber = " + computerNumber);
        Assertions.assertEquals(computerNumber.length(), 3);
    }

    @Test
    public void generateRandomNumber() throws Exception{
        // given
        // when
        String randomNumber = RandomNumberFactory.generate();

        // then
        System.out.println("randomNumber = " + randomNumber);
        Assertions.assertEquals(randomNumber.length(), 3);
        Assertions.assertTrue(Integer.parseInt(randomNumber) < 1000);
    }


}
