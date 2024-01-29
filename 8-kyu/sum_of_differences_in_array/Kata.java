package sum_of_differences_in_array;

import java.util.Arrays;

class Kata {
    static int sumOfDifferences(int[] arr) {
        Arrays.sort(arr);
        int length = arr.length;
        int sum = 0;
        for (int i = length - 1; i > 0; i--) {
            sum += arr[i] - arr[i - 1];
        }
        return sum;
    }
}
