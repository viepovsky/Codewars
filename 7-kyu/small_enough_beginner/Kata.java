package small_enough_beginner;

import java.util.Arrays;

class Kata {
    static boolean smallEnough(int[] a, int limit) {
        return a.length == Arrays.stream(a).filter(i -> i <= limit).count();
    }
}
