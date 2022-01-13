package baseball;

import java.util.ArrayList;
import java.util.stream.Collectors;

class RandomNumberFactory {
    public static String generate() {
        ArrayList<Integer> numberList = new ArrayList<>();
        int max = 9;
        int min = 1;
        while (numberList.size() != 3) {
            int number = (int) (Math.random() * (max - min) + min);
            if (!numberList.contains(number)) numberList.add(number);
        }
        return numberList.stream().map(String::valueOf).collect(Collectors.joining());
    }
}
