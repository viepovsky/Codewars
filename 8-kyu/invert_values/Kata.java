package invert_values;

import java.util.Arrays;

class Kata {
    static int[] invert(int[] array) {
        return Arrays.stream(array)
                .map(Math::negateExact)
                .toArray();
    }
}
