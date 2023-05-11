package collatz_conjecture_length;

import java.util.ArrayList;
import java.util.List;

public class Collatz {
    public static long conjecture(long x) {
        long number = x;
        List<Long> operationResults = new ArrayList<>();
        operationResults.add(number);
        while (number != 1) {
            number = (number % 2 == 0 ? number / 2 : number * 3 + 1);
            operationResults.add(number);
        }
        return operationResults.size();
    }
}
