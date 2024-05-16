package kata_example_twist;

import java.util.Arrays;

class Kata {
    static String[] kataExampleTwist() {
        String[] websites = new String[1000];
        return Arrays.stream(websites)
                         .map(n -> "codewars")
                         .toArray(String[]::new);
    }
}
