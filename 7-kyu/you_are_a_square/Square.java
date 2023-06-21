package you_are_a_square;

class Square {
    static boolean isSquare(int n) {
        return (int) Math.sqrt(n) * (int) Math.sqrt(n) == n;
    }
}
