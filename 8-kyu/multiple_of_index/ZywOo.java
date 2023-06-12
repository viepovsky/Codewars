package multiple_of_index;

import java.util.stream.IntStream;

class ZywOo {
    static int[] multipleOfIndex(int[] array) {
        return IntStream.range(1, array.length)
                .filter(i -> array[i] % i == 0)
                .map(i -> array[i])
                .toArray();
    }
}
