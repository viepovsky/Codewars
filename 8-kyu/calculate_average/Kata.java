package calculate_average;

import java.util.Arrays;

public class Kata {
    public static double find_average(int[] array){
        return array.length == 0 ? 0 : (double)Arrays.stream(array).sum() / array.length;
    }
}
