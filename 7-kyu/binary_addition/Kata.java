package binary_addition;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

class Kata {
    static String binaryAddition(int a, int b){
        int sum = a + b;
        boolean loopEnd = false;
        List<Integer> result = new ArrayList<>();
        while (!loopEnd) {
            result.add(sum % 2);
            sum /= 2;
            if (sum == 0){
                loopEnd = true;
            }
        }
        Collections.reverse(result);
        return result.stream()
                .map(String::valueOf)
                .collect(Collectors.joining(""));
    }
}
