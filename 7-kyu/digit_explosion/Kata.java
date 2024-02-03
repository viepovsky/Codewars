package digit_explosion;

import java.util.stream.Collectors;

class Kata {
    static String explode(String digits) {
        return digits.chars()
                     .map(Character::getNumericValue)
                     .mapToObj(i -> String.valueOf(i)
                                          .repeat(i))
                     .collect(Collectors.joining());
    }
}
