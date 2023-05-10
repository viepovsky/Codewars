package character_with_longest_consecutive_repetition;

import java.util.ArrayList;
import java.util.List;

public class Solution {
    public static Object[] longestRepetition(String s) {
        if(s.length() == 0) return new Object[]{"", 0};
        List<Integer> characterRepetitionSums = new ArrayList<>();
        int timesRepeat = 1;
        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == s.charAt(i + 1)) {
                timesRepeat++;
                if (i + 1 == s.length() - 1) {
                    characterRepetitionSums.add(timesRepeat);
                }
            } else {
                characterRepetitionSums.add(timesRepeat);
                timesRepeat = 1;
            }
        }
        timesRepeat = 0;
        for (int singleSum : characterRepetitionSums) {
            if (singleSum > timesRepeat) timesRepeat = singleSum;
        }
        int indexOfMostRepeatChar = 0;
        for (int singleSum : characterRepetitionSums) {
            if (singleSum == timesRepeat) break;
            indexOfMostRepeatChar += singleSum;
        }
        char character = s.charAt(indexOfMostRepeatChar);
        return new Object[]{String.valueOf(character), timesRepeat};
    }
}
