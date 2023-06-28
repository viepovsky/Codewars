package count_the_digit;

import java.util.stream.IntStream;

class CountDig {
    static int nbDig(int n, int d) {
        return IntStream.rangeClosed(0, n)
                .map(i -> {
                    String square = String.valueOf(i * i);
                    if (square.contains("" + d)) {
                        return square.length() - square.replaceAll(String.valueOf(d), "").length();
                    } else {
                        return 0;
                    }
                })
                .sum();
    }
}
