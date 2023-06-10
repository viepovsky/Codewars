package sum_of_positive;

import java.util.Arrays;

class Kata {
    static int sum(int[] arr){
        return Arrays.stream(arr).filter(n -> n > 0).sum();
    }
}
