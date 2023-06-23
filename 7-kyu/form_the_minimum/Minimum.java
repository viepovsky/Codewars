package form_the_minimum;

import java.util.Arrays;

class Minimum {
    static int minValue(int[] values){
        return Arrays.stream(values)
                .distinct()
                .sorted()
                .reduce((a, b) -> Integer.parseInt("" + a + b))
                .getAsInt();
    }
}
