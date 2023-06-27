package beginner_reduce_but_grow;

import java.util.Arrays;

class Kata {
    static int grow(int[] x){
        return Arrays.stream(x).reduce((a, b) -> a * b).getAsInt();
    }
}
