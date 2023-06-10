package remove_consecutive_duplicate_words;

import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.stream.Collectors;

class Kata {
    static String removeConsecutiveDuplicates(String s) {
        List<String> strings = Arrays.stream(s.split(" ")).collect(Collectors.toList());
        Iterator<String> iterator = strings.iterator();
        String previous = strings.get(0);
        int i = 0;
        while (iterator.hasNext()) {
            String next = iterator.next();
            if (i >= 1) {
                if (next.equals(previous)) {
                    iterator.remove();
                } else {
                    previous = next;
                }
            }
            i++;
        }
        return String.join(" ", strings);
    }
}
