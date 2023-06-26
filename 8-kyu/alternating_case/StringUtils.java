package alternating_case;

import java.util.stream.Collectors;

class StringUtils {
    static String toAlternativeString(String string) {
        return string.chars()
                .mapToObj(i -> (char) i)
                .map(i -> {
                    if (Character.isLowerCase(i)) return Character.toUpperCase(i);
                    if (Character.isUpperCase(i)) return Character.toLowerCase(i);
                    return i;
                })
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
}
