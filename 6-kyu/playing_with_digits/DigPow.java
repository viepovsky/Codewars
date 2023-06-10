package playing_with_digits;

import java.math.BigDecimal;

class DigPow {
    static long digPow(int n, int p) {
        BigDecimal sum = BigDecimal.ZERO;
        for (char digit : String.valueOf(n).toCharArray()) {
            BigDecimal power = BigDecimal.valueOf(Character.getNumericValue(digit)).pow(p);
            sum = sum.add(power);
            p++;
        }
        if (!sum.remainder(BigDecimal.valueOf(n)).equals(BigDecimal.ZERO)) {
            return -1;
        }
        return sum.divide(BigDecimal.valueOf(n)).longValue();
    }
}
