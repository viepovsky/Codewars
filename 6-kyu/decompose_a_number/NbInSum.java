package decompose_a_number;

import java.util.ArrayList;
import java.util.List;

import static java.lang.Math.pow;

class NbInSum {
    static long[][] decompose(long number) {
        List<Integer> k = new ArrayList<>();
        long sum = 0;
        outLoop: for (int n = 2; n < Integer.MAX_VALUE; n++) {
            for (int i = 1; i < Integer.MAX_VALUE; i++) {
                if (sum + pow(n, 1) >= number) break outLoop;
                if (sum + pow(n, i) <= number && sum + pow(n, i + 1) > number) {
                    if (i == 1) {
                        break outLoop;
                    }
                    k.add(i);
                    sum += pow(n, i);
                    break;
                }
            }
        }
        long[][] result = new long[2][k.size()];
        for (int i = 0; i < k.size(); i++) {
            result[0][i] = k.get(i);
        }
        result[1] = new long[]{number - sum};
        return result;
    }
}
