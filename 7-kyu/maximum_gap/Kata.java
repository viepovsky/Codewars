package maximum_gap;

import java.util.Arrays;

class Kata {
    static int maxGap(int[] numbers) {
        Arrays.sort(numbers);
        int maxGap = 0;
        for (int i = 0; i < numbers.length - 1; i++) {
            int gap =Math.abs(numbers[i] - numbers[i + 1]);
            if ( gap> maxGap) {
                maxGap = gap;
            }
        }
        return maxGap;
    }
}
