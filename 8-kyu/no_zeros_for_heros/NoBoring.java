package no_zeros_for_heros;

class NoBoring {
    static int noBoringZeros(int n) {
        if (n == 0) return 0;
        n = n % 10 == 0 ? n / 10 : n;
        return n % 10 == 0 ? noBoringZeros(n) : n;
    }
}
