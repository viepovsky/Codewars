package find_the_parity_outlier;

import java.util.Arrays;

class FindOutlier {
    static int find(int[] integers) {
        boolean even = false;
        int countEven = 0, countOdd = 0;
        for (int i = 0; i < integers.length; i++) {
            if (integers[i] % 2 == 0) {
                countEven++;
            } else {
                countOdd++;
            }
            if (countEven == 2) break;
            if (countOdd == 2) {
                even = true;
                break;
            }
        }
        return even ? Arrays.stream(integers).filter(n -> n % 2 == 0).findFirst().getAsInt() : Arrays.stream(integers).filter(n -> n % 2 != 0).findFirst().getAsInt();
    }
}
