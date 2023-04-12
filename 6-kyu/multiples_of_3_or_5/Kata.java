package multiples_of_3_or_5;

import java.util.ArrayList;
import java.util.List;

public class Kata {
    public int solution(int number) {
        if (number < 0) return -1;
        int result = 0, mult3 = 0, mult5 = 0;
        List<Integer> multiplesOf3 = new ArrayList<>();
        List<Integer> multiplesOf5 = new ArrayList<>();
        while(mult3 <= number) {
            mult3 += 3;
            if (mult3 < number) multiplesOf3.add(mult3);
            mult5 += 5;
            if (mult5 < number) multiplesOf5.add(mult5);
        }
        multiplesOf5.removeAll(multiplesOf3);
        result = multiplesOf3.stream().mapToInt(Integer::intValue).sum() + multiplesOf5.stream().mapToInt(Integer::intValue).sum();
        return result;
    }
}
