package square_n_sum;

import java.util.Arrays;

public class Kata {
    public static int squareSum(int[] n) {
        return Arrays.stream(n).map(v -> v * v).sum();
    }
}
