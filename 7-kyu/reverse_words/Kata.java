package reverse_words;

import java.util.Arrays;
import java.util.stream.Collectors;

class Kata {
    static String reverseWords(final String original) {
        return original.matches(" *") ? original : Arrays.stream(original.split(" ")).map(StringBuilder::new).map(StringBuilder::reverse).collect(Collectors.joining(" "));
    }
}
