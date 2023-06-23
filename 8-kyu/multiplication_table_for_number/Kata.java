package multiplication_table_for_number;

import java.util.stream.Collectors;
import java.util.stream.IntStream;

class Kata {
    static String multiTable(int num) {
        return IntStream.rangeClosed(1, 10)
                .mapToObj(i -> new StringBuilder().append(i).append(" * ").append(num).append(" = ").append(i * num).append("\n"))
                .map(StringBuilder::toString)
                .collect(Collectors.joining())
                .trim();
    }
}

