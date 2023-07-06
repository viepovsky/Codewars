package a_needle_in_the_haystack;

import java.util.stream.IntStream;

class Kata {
    static String findNeedle(Object[] haystack) {
        return "found the needle at position " + IntStream.range(0, haystack.length)
                .filter(i -> haystack[i] instanceof String)
                .filter(i -> haystack[i].equals("needle"))
                .findFirst()
                .getAsInt();
    }
}
