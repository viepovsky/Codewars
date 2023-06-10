package playing_with_passphrases;

import java.util.List;

class PlayPass {
    static String playPass(String s, int n) {
        String shifted = shiftString(s, n);
        String replaced = replaceDigit(shifted);
        String swapped = swapLetters(replaced);
        return reverse(swapped);
    }

    private static String reverse(String s) {
        StringBuilder result = new StringBuilder(s);
        return result.reverse().toString();
    }

    private static String shiftString(String s, int n) {
        String result = "";
        List<Character> alphabetUpperCase = List.of('A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K', 'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z');
        List<Character> alphabetLowerCase = alphabetUpperCase.stream().map(c -> c.toString().toLowerCase().charAt(0)).toList();
        for (int i = 0; i < s.length(); i++) {
            int shift = n % 26;
            if (alphabetUpperCase.contains(s.charAt(i))) {
                shift += alphabetUpperCase.indexOf(s.charAt(i));
                result += alphabetUpperCase.get(shift);
            } else if (alphabetLowerCase.contains(s.charAt(i))) {
                shift += alphabetLowerCase.indexOf(s.charAt(i));
                result += alphabetLowerCase.get(shift);
            } else {
                result += s.charAt(i);
            }
        }
        return result;
    }

    private static String replaceDigit(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                int replace = 9 - Character.getNumericValue(s.charAt(i));
                result += String.valueOf(replace);
            } else {
                result += s.charAt(i);
            }
        }
        return result;
    }

    private static String swapLetters(String s) {
        String result = "";
        for (int i = 0; i < s.length(); i++) {
            if (String.valueOf(s.charAt(i)).matches("[a-zA-Z]")) {
                result += i % 2 == 0 ? Character.toUpperCase(s.charAt(i)) : Character.toLowerCase(s.charAt(i));
            } else {
                result += s.charAt(i);
            }
        }
        return result;
    }
}
