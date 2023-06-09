package alternate_case;

import java.util.stream.Collectors;

class Kata {
    static String alternateCase(final String string) {
        return string.chars()
                .mapToObj(i -> (char) i).map(i -> {
            if (Character.isUpperCase(i)) {
               return Character.toLowerCase(i);
            } else {
                return Character.toUpperCase(i);
            }
        }).map(String::valueOf).collect(Collectors.joining());
    }
}
