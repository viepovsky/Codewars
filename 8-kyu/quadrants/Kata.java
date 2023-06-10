package quadrants;

class Kata {
    public static int quadrant(int x, int y) {
        if (x * y > 0) {
            return x > 0 ? 1 : 3;
        } else {
            return x > 0 ? 4 : 2;
        }
    }
}
