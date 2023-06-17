package sum_arrays;

import java.util.Arrays;

class SumArray {
    static double sum(double[] numbers) {
        return Arrays.stream(numbers).sum();
    }
}
