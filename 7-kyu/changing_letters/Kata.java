package changing_letters;

import java.util.List;
import java.util.stream.Collectors;

class Kata {
    private static final List<Character> vowels = List.of('a', 'e', 'i', 'o', 'u');

    static String swap(String st) {
        return st.chars()
                 .mapToObj(c -> (char) c)
                 .map(c -> vowels.contains(c) ? Character.toUpperCase(c) : c)
                 .map(String::valueOf)
                 .collect(Collectors.joining());
    }
}
