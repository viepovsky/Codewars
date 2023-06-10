package calculate_average;

import java.util.Arrays;

class Kata {
    static double find_average(int[] array){
        return array.length == 0 ? 0 : (double)Arrays.stream(array).sum() / array.length;
    }
}
