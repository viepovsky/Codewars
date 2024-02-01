package factorial.java;

class Kata {
    static long factorial(int n) {
        if (n <= 1) return 1;
        return n * factorial(n - 1);
    }
    static long factorial2(int n) {
        return n <= 1 ? 1 : n * factorial(n - 1);
    }
}
