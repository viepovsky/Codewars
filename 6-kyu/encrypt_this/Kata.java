package encrypt_this;

import java.util.Arrays;
import java.util.stream.Collectors;

class Kata {
    static String encryptThis(String text) {
        return Arrays.stream(text.split(" "))
                .map(s -> switch (s.length()) {
                    case 0 -> "";
                    case 1 -> "" + (int)s.charAt(0);
                    case 2 -> "" + (int)s.charAt(0) + s.charAt(1);
                    case 3 -> "" + (int)s.charAt(0) + s.charAt(2) + s.charAt(1);
                    default -> "" + (int)s.charAt(0) + s.charAt(s.length() - 1) + s.substring(2, s.length() - 1) + s.charAt(1);
                })
                .collect(Collectors.joining(" "))
                .trim();
    }
}
