package nth_smallest_element;

import java.util.Arrays;

class Kata {
    static int nthSmallest(final int[] arr, final int n) {
        Arrays.sort(arr);
        return arr[n - 1];
    }
}
