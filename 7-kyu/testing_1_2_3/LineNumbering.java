package testing_1_2_3;

import java.util.List;
import java.util.stream.IntStream;

class LineNumbering {
    static List<String> number(List<String> lines) {
        return IntStream.range(0, lines.size())
                .peek(i -> {
            String newLine = (i + 1) + ": " + lines.get(i);
            lines.set(i, newLine);
        })
                .mapToObj(lines::get)
                .toList();
    }
}
