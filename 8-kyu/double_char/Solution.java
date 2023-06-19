package double_char;

import java.util.stream.Collectors;

class Solution {
    static String doubleChar(String s){
        return s.chars()
                .mapToObj(Character::toString)
                .map(n -> n + n)
                .collect(Collectors.joining());
    }
}
