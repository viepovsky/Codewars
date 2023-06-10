package digit_digit;

import java.util.stream.Stream;

class Kata {
    static int squareDigits(int n) {
        int[] integers = Stream.of(String.valueOf(n).split("")).mapToInt(Integer::parseInt).toArray();
        String result = "";
        for (int doubleIt : integers) {
            result += String.valueOf(doubleIt * doubleIt);
        }
        return Integer.parseInt(result);
    }
}
