package largest_elements;

import java.util.Arrays;

class Kata {
    static int[] largest(int n, int[] arr) {
        int[] sorted = Arrays.stream(arr)
                             .sorted()
                             .toArray();

        return Arrays.stream(sorted, sorted.length - n, sorted.length)
                     .toArray();
    }
}
