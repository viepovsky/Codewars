package find_the_integral;

class Kata {
    static String integrate(int coefficient, int exponent) {
        return coefficient / ++exponent + "x^" + exponent;
    }
}
