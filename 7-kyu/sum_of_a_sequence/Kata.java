package sum_of_a_sequence;

class Kata {
    static int sequenceSum(int start, int end, int step) {
        int sum = 0;
        for (int i = start; i <= end; i += step) {
            sum += i;
        }
        return sum;
    }
}
