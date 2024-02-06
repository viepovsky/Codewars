package data_reverse;

import java.util.Arrays;
import java.util.stream.Collectors;

class Kata {
    static int[] dataReverse(int[] data) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i <= data.length - 8; i += 8) {
            String bits = Arrays.stream(data, i, i + 8)
                                .mapToObj(Integer::toString)
                                .collect(Collectors.joining());

            result.insert(0, bits);
        }
        return result.chars()
                     .map(Character::getNumericValue)
                     .toArray();
    }
}
