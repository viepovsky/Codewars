package square_n_sum;

import java.util.Arrays;

class Kata {
    static int squareSum(int[] n) {
        return Arrays.stream(n).map(v -> v * v).sum();
    }
}
