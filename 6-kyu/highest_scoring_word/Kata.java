package highest_scoring_word;

import java.util.Arrays;
import java.util.List;

class Kata {
    static String high(String s) {
        String[] words = s.split(" ");
        List<Integer> result = Arrays.stream(words)
                .map(i -> i.chars().mapToObj(j -> Character.getNumericValue(j) - 9).mapToInt(k -> k).sum())
                .mapToInt(i -> i)
                .boxed()
                .toList();
        int maxScore = result.stream().max(Integer::compareTo).get();
        int index = result.indexOf(maxScore);
        return words[index];
    }
}
