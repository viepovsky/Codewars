package two_to_one;

import java.util.stream.Collectors;

class TwoToOne {
    static String longest (String s1, String s2) {
        return s1.concat(s2)
                .chars()
                .mapToObj(i -> (char) i)
                .filter(Character::isLetter)
                .distinct()
                .sorted()
                .map(String::valueOf)
                .collect(Collectors.joining());
    }
}
