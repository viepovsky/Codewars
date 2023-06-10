package count_of_positives;

import java.util.Arrays;
import java.util.stream.IntStream;

class Kata {
    static int[] countPositivesSumNegatives(int[] input) {
        try {
            if (Arrays.stream(input).filter(n -> n == 0).count() == input.length) {
                return new int[0];
            }
            int[] sum = new int[2];
            sum[0] = (int) IntStream.of(input).filter(n -> n > 0).count();
            sum[1] = IntStream.of(input).filter(n -> n < 0).sum();
            return sum;
        } catch (Exception e) {
            return new int[0];
        }
    }
}
