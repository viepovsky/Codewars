package sum_of_multiples;

class Kata {
    static long sumMul(int n, int m) {
        if (m <= 0 || n <= 0) throw new IllegalArgumentException();
        int result = 0;
        for (int i = 1; i < Integer.MAX_VALUE; i++) {
            int sum = i * n;
            if (sum < m) {
                result += sum;
            } else {
                break;
            }
        }
        return result;
    }
}
