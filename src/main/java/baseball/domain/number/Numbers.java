package baseball.domain.number;

import java.util.ArrayList;
import java.util.List;

public class Numbers {
    private final List<Integer> numbers = new ArrayList<>();

    public void add(int number) {
        numbers.add(number);
    }

    public boolean contain(int number) {
        return numbers.contains(number);
    }

    public int size() {
        return numbers.size();
    }

    public int get(int index) {
        return numbers.get(index);
    }

    @Override
    public String toString() {
        return numbers.toString();
    }
}
