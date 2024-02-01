package number_of_trailing_zeros_of_n_factorial;

class Kata {
    static int zeros(int n) {
        int trailingZeros = 0;
            while (n >= 5) {
                n /= 5;
                trailingZeros += n;
            }
        return trailingZeros;
    }
}
