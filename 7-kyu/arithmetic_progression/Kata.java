package arithmetic_progression;

class Kata {
    static String arithmeticSequenceElements(int a, int d, long n) {
        StringBuilder sb = new StringBuilder();
        sb.append(a);
        for (int i = 1; i < n; i++) {
            sb.append(", ");
            sb.append(a + i * d);
        }
        return sb.toString();
    }
}
