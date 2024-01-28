package max_diff_easy;

import java.util.Arrays;

class Kata {
    static int maxDiff(int[] lst) {
        return Arrays.stream(lst).max().orElse(0) - Arrays.stream(lst).min().orElse(0);
    }
}
