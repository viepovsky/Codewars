package the_old_switcheroo;

import java.util.List;

class Kata {
    static String vowel2Index(String s) {
        List<Character> vowels = List.of('a','e','i','o','u');
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);
            if (vowels.contains(character)) {
                result.append(i + 1);
            } else {
                result.append(character);
            }
        }
        return result.toString();
    }
}
