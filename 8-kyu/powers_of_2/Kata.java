package powers_of_2;

import java.util.stream.LongStream;

class Kata {
    static long[] powersOfTwo(int n) {
        return LongStream.rangeClosed(0, n).map(i -> (long) Math.pow(2, i)).toArray();
    }
}
