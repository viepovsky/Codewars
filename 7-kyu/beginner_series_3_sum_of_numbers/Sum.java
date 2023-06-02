package beginner_series_3_sum_of_numbers;

import java.util.stream.IntStream;

public class Sum {
    public int GetSum(int a, int b) {
        return a <= b ? IntStream.range(a, b + 1).sum() : IntStream.range(b, a + 1).sum();
    }
}
