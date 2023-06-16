package triangular_treasure;

import java.util.stream.LongStream;

class Triangular {
    static long triangular(long n) {
        return n > 0 ? LongStream.rangeClosed(0, n).sum() : 0;
    }
}
