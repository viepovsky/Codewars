package shortest_word;

import java.util.Arrays;

class Kata {
    static int findShort(String s) {
        return Arrays.stream(s.split(" "))
                    .mapToInt(String::length)
                    .min()
                    .orElse(0);
    }
}
