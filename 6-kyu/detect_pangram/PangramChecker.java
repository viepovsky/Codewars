package detect_pangram;

import java.util.HashSet;
import java.util.Set;

class PangramChecker {
    boolean check(String sentence){
        Set<Character> letters = Set.of('a','b','c','d','e','f','g','h','i','j','k','l','m','n','o','p','q','r','s','t','u','v','w','x','y','z');
        Set<Character> alphabet = new HashSet<>();
        sentence.chars()
                .mapToObj(i -> (char)i)
                .forEach(i -> {
                    if (letters.contains(Character.toLowerCase(i))) alphabet.add(Character.toLowerCase(i));
                });
        return alphabet.size() == 26;
    }
}
