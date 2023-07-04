package sum_without_highest_and_lowest_number;

import java.util.Arrays;

class Kata {
    static int sum(int[] numbers) {
        if (numbers == null || numbers.length <= 1) return 0;
        numbers = Arrays.stream(numbers)
                .sorted()
                .toArray();
        int sum = 0;
        for (int i = 1; i < numbers.length - 1; i++) {
            sum += numbers[i];
        }
        return sum;
    }
}
