package minimize_sum_of_array;

import java.util.Arrays;

class Solution {
    static int minSum(int[] passed)
    {
        int[] sorted = Arrays.stream(passed).sorted().toArray();
        int sum = 0;
        for (int i = 0; i < sorted.length / 2; i++) {
            sum += sorted[i] * sorted[sorted.length - 1 - i];
        }
        return sum;
    }
}
