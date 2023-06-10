package whats_a_perfect_power_anyway;

class PerfectPower {
    static int[] isPerfectPower(int n) {
        int m = 2, k = 2;
        boolean endLoop = false;
        while (!endLoop) {
            double power = Math.pow(m, k);
            if (power == n) {
                return new int[]{m, k};
            }
            if (Math.pow(m, 2) > n) {
                break;
            }
            if (power > n) {
                m += 1;
                k = 2;
            } else {
                k++;
            }
        }
        return null;
    }
}
