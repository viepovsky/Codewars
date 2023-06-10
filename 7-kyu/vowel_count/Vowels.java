package vowel_count;

import java.util.List;

class Vowels {
    static int getCount(String str) {
        String vowels = "aeiou";
        List<Character> list = str.chars().mapToObj(c -> (char) c).toList();
        return (int) list.stream().filter(c -> vowels.contains(c.toString())).count();
    }
}
