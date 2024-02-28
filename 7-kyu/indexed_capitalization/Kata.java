package indexed_capitalization;

import java.util.Arrays;
import java.util.List;

class Kata {
    static String capitalize(String s, int[] ind) {
        StringBuilder sb = new StringBuilder();
        char[] chars = s.toCharArray();
        List<Integer> indexes = Arrays.stream(ind)
                                      .boxed()
                                      .toList();
        for (int i = 0; i < chars.length; i++) {
            sb.append(indexes.contains(i) ? Character.toUpperCase(chars[i]) : chars[i]);
        }
        return sb.toString();
    }
}
