package find_nearest_square_number;

class CodeWarsMath {
    static int nearestSq(final int n){
        double squareRoot = Math.sqrt(n);
        if (squareRoot % 1 == 0) return n;
        int a = (int) squareRoot;
        int b = a + 1;
        int aSquare = a * a;
        int bSquare = b * b;
        if (n - aSquare < bSquare - n) {
            return aSquare;
        } else {
            return bSquare;
        }
    }
}
