package what_is_between;

import java.util.stream.IntStream;

class Kata {
    static int[] between(int a, int b) {
        return IntStream.range(a, b + 1).toArray();
    }
}
