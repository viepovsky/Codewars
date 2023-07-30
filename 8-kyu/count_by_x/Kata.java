package count_by_x;

import java.util.stream.IntStream;

class Kata {
    static int[] countBy(int x, int n){
        return IntStream.rangeClosed(1, n)
                .map(i -> i * x)
                .toArray();
    }
}
