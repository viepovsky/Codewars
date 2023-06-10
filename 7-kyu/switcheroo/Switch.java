package switcheroo;

import java.util.stream.Collectors;

class Switch {
    static String switcheroo(String x) {
        return x.chars()
                .mapToObj((c -> (char)c))
                .map(c -> {
            if (c.equals('a')) return c = 'b';
            if (c.equals('b')) return c = 'a';
            return c;
        })
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
}
