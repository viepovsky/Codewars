package count_characters_in_your_string;

import java.util.HashMap;
import java.util.Map;

public class Kata {
    public static Map<Character, Integer> count(String str) {
        Map<Character, Integer> result = new HashMap<>();
        str.chars().mapToObj(n -> (char) n).forEach(n ->{
            if (result.containsKey(n)) {
                int times = result.get(n);
                times++;
                result.replace(n, times);
            } else {
               result.put(n, 1);
            }
        });
        return result;
    }
}
