package sum_of_odd_cubed_numbers;

import java.util.Arrays;

class Kata {
    static int cubeOdd(int[] arr) {
        return Arrays.stream(arr)
                     .filter(i -> i % 2 != 0)
                     .map(i -> i * i * i)
                     .sum();
    }
}
