package scramblies;

import java.util.ArrayList;
import java.util.List;

public class Scramblies {
    public static boolean scramble(String str1, String str2) {
        boolean isPossible = true;
        List<Character> alreadyCheckedLetters = new ArrayList<>();
        for (int i = 0; i < str2.length(); i++) {
            char letter = str2.charAt(i);
            if (!alreadyCheckedLetters.contains(letter)) {
                int timesInSecond = str2.length() - str2.replaceAll(String.valueOf(letter),"").length();
                int timesInFirst = str1.length() - str1.replaceAll(String.valueOf(letter),"").length();
                alreadyCheckedLetters.add(letter);
                if (timesInFirst < timesInSecond) {
                    isPossible = false;
                    break;
                }
            }
        }
        return isPossible;
    }
}
