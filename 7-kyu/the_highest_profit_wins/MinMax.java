package the_highest_profit_wins;

import java.util.Arrays;

class MinMax {
    static int[] minMax(int[] arr) {
        return new int[]{Arrays.stream(arr).min().getAsInt(), Arrays.stream(arr).max().getAsInt()};
    }
}
