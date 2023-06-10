package return_negative;

class Kata {
    static int makeNegative(final int x) {
        return x > 0 ? x - 2 * x : x;
    }
}
