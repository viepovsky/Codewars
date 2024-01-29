package sort_and_star;

import java.util.Arrays;
import java.util.stream.Collectors;

class Kata {
    static String twoSort(String[] s) {
        Arrays.sort(s);
        return s[0].chars()
                   .mapToObj(Character::toString)
                   .collect(Collectors.joining("***"));
    }
}
