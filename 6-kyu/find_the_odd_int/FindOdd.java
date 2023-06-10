package find_the_odd_int;

import java.util.Objects;

class FindOdd {
    static int findIt(int[] a) {
        int resultNumber = 0;
        for (int i = 0; i < a.length; i++) {
            int timesInArray = 1;
            for (int j = 0; j < a.length; j++) {
                if (a[i] == a[j] && i != j) {
                    timesInArray++;
                }
            }
            if (timesInArray % 2 == 1) {
                resultNumber = a[i];
                break;
            }
        }
        return resultNumber;
    }
}
