package sort_the_odd;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Kata {
    public static int[] sortArray(int[] array) {
        List<Integer> oddList = new ArrayList<>();
        for (int i : array) {
            if (i % 2 != 0) {
                oddList.add(i);
            }
        }
        Collections.sort(oddList);
        for (int i = 0; i < array.length; i++){
            if (array[i] % 2 == 0) {
                oddList.add(i, array[i]);
            }
        }
        return oddList.stream().mapToInt(Integer::intValue).toArray();
    }
}
