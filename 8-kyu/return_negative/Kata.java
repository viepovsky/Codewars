package return_negative;

public class Kata {
    public static int makeNegative(final int x) {
        return x > 0 ? x - 2 * x : x;
    }
}
