package ordered_count_of_characters;


import java.util.*;

class Solution {
    void orderedCount(String text) {
        List<Pair<Character, Integer>> list = new ArrayList<>();
        Map<Character, Integer> map = new LinkedHashMap<>();
        for (int i = 0; i < text.length(); i++) {
            char currChar = text.charAt(i);
            if (map.containsKey(currChar)) {
                map.put(currChar, map.get(currChar) + 1);
            } else {
                map.put(currChar, 1);
            }
        }
        for (Map.Entry<Character, Integer> entry : map.entrySet()) {
            list.add(Pair.of(entry.getKey(), entry.getValue()));
        }
    }

}

class Pair<Character, Integer> {
    static <Character, Integer>Pair<Character, Integer> of(Character character, Integer integer) {
        return null;
    }
}

