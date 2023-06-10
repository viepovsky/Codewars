package correct_the_mistakes_of_the_character_recognition_software;

import java.util.stream.Stream;

class Correct {
    static String correct(String string) {
        return Stream.of(string)
                .map(n -> n.replaceAll("(5)", "S").replaceAll("(0)", "O").replaceAll("(1)", "I"))
                .toList().get(0);
    }
}
