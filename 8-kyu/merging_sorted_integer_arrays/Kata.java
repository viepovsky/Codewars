package merging_sorted_integer_arrays;

import java.util.Arrays;
import java.util.stream.Stream;

class Kata {
    public static int[] mergeArrays(int[] first, int[] second) {
        return Stream.of(Arrays.stream(first), Arrays.stream(second))
                     .flatMapToInt(i -> i)
                     .distinct()
                     .sorted()
                     .toArray();
    }
}
