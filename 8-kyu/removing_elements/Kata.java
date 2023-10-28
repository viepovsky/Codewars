package removing_elements;

import java.util.stream.IntStream;

class Kata {
    static Object[] removeEveryOther(Object[] arr) {
        return IntStream.range(0, arr.length)
                .filter(i -> i % 2 == 0)
                .mapToObj(i -> arr[i])
                .toArray();
    }
}
