package pythagorean_triple;

class Kata {
    int pythagoreanTriple(int[] triple){
        double a = Math.pow(triple[0], 2);
        double b = Math.pow(triple[1], 2);
        double c = Math.pow(triple[2], 2);

        if (a + b == c) return 1;
        if (a + c == b) return 1;
        if (b + c == a) return 1;
        return 0;
    }
}
