package sum_of_cubes;

import java.util.stream.LongStream;

class Kata {
    static long sumCubes(long n) {
        return LongStream.rangeClosed(1, n)
                         .map(i -> (long) Math.pow(i, 3))
                         .sum();
    }
}
