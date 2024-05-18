package largest_pair_sum_in_array;

import java.util.Arrays;

class Kata {
    static int largestPairSum(int[] numbers) {
        Arrays.sort(numbers);
        int length = numbers.length;
        return numbers[length - 1] + numbers[length - 2];
    }
}
