package find_the_stray_number;

import java.util.Arrays;

public class Solution {
    static int stray(int[] numbers) {
        int result = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            if(numbers[i] == numbers[i + 1]) {
                int same = numbers[i];
                result = Arrays.stream(numbers).filter(n -> n != same).findFirst().getAsInt();
                break;
            }
        }
        return result;
    }
}
