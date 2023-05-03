package sum_of_positive;

import java.util.Arrays;

public class Kata {
    public static int sum(int[] arr){
        return Arrays.stream(arr).filter(n -> n > 0).sum();
    }
}
