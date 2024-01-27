package flatten_and_sort_an_array;

import java.util.Arrays;

class Kata {
    static int[] flattenAndSort(int[][] array) {
        return Arrays.stream(array)
                     .flatMapToInt(Arrays::stream)
                     .sorted()
                     .toArray();
    }
}
