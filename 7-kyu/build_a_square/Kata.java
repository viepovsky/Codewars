package build_a_square;

import java.util.stream.IntStream;

public class Kata {
    public static final String generateShape(int n) {
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < n; i++) {
            IntStream.range(0, n).forEach(j -> builder.append("+"));
            if (i != n - 1) builder.append("\n");
        }
        return builder.toString();
    }
}
