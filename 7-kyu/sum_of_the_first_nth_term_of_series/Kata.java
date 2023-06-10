package sum_of_the_first_nth_term_of_series;

import java.math.BigDecimal;
import java.math.RoundingMode;

class Kata {
    static String seriesSum(int n) {
        if (n == 0) {
            return "0.00";
        }
        double result = 1.0;
        for (double i = 0; i < n * 3 - 3; i += 3) {
            result += 1 / (4 + i);
        }
        return String.valueOf(BigDecimal.valueOf(result).setScale(2, RoundingMode.HALF_UP));
    }
}
