package find_the_next_perfect_square;

public class NumberFun {
    public static long findNextSquare(long sq) {
        double root = Math.sqrt(sq);
        if (sq % root != 0) {
            return -1;
        }
        return (long) ((root + 1) * (root + 1));
    }
}
