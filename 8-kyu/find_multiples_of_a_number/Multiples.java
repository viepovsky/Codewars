package find_multiples_of_a_number;

import java.util.stream.IntStream;

class Multiples {
    static int[] find(int base, int limit) {
        return IntStream.rangeClosed(base, limit)
                .filter(i -> i % base == 0)
                .toArray();
    }
}
