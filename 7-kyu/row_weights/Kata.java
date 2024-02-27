package row_weights;

import java.util.stream.IntStream;

class Kata {
    static int[] rowWeights(final int[] weights) {
        int[] teams = new int[2];
        IntStream.range(0, weights.length)
                 .forEach(i -> teams[i % 2] += weights[i]);
        return teams;
    }
}
