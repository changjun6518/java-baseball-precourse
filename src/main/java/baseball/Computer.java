package baseball;

public class Computer {
    private String number;

    public Computer() {
    }


    public void generateNumber() {
        number = RandomNumberFactory.generate();
    }

    public String getNumber() {
        return number;
    }

}
