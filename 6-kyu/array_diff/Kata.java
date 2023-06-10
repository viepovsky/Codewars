package array_diff;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class Kata {
    static int[] arrayDiff(int[] a, int[] b) {
        List<Integer> integersA = new ArrayList<>(Arrays.stream(a).boxed().toList());
        List<Integer> integersB = Arrays.stream(b).boxed().toList();
        integersA.removeAll(integersB);
        return integersA.stream().mapToInt(Integer::intValue).toArray();
    }
}
