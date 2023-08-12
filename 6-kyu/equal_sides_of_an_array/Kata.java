package equal_sides_of_an_array;

import java.util.Arrays;

class Kata {
    static int findEvenIndex(int[] arr) {
        int result = -1;
        for (int i = 0; i < arr.length; i++) {
            int sumLeft = Arrays.stream(arr, 0, i).sum();
            int sumRight = Arrays.stream(arr,i + 1, arr.length).sum();
            if (sumLeft == sumRight) {
                result = i;
                break;
            }
        }
        return result;
    }
}
