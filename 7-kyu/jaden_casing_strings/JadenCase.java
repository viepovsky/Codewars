package jaden_casing_strings;

import java.util.Arrays;
import java.util.stream.Collectors;

public class JadenCase {
    public String toJadenCase(String phrase) {
        if (phrase == null || phrase.equals("")) {
            return null;
        }
        return Arrays.stream(phrase.split("( )"))
                .map(n -> n.replace(n.charAt(0), String.valueOf(n.charAt(0)).toUpperCase().charAt(0)))
                .collect(Collectors.joining(" "));
    }
}
