package count_the_smiley_faces;

import java.util.List;

class Kata {
    static int countSmileys(List<String> arr) {
        return (int) arr.stream()
                        .filter(i -> i.matches("[:;][-~]?[)D]"))
                        .count();
    }
}
