package compare_with_margin;

class Kata {
    static int closeCompare(double a, double b) {
        return closeCompare(a, b, 0);
    }

    static int closeCompare(double a, double b, double margin) {
        return Math.abs(a - b) <= margin ? 0 : a > b ? 1 : -1;
    }
}
