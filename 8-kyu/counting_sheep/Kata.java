package counting_sheep;

import java.util.Arrays;

class Kata {
    int countSheeps(Boolean[] arrayOfSheeps) {
        return (int) Arrays.stream(arrayOfSheeps)
                           .filter(bool -> bool != null && bool)
                           .count();
    }
}
