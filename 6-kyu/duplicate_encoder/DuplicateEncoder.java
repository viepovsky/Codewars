package duplicate_encoder;

import java.util.stream.Collectors;

class DuplicateEncoder {
    static String encode(String word){
        String tempWord = word.toLowerCase();
        return tempWord.chars()
                .mapToObj(n -> (char) n)
                .map(String::valueOf)
                .map(n -> {
                if (tempWord.length() - tempWord.replace(n, "").length() >= 2) {
                    n = ")";
                } else {
                    n = "(";
                }
                return n;
                })
                .collect(Collectors.joining());
    }
}
