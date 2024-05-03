package find_count_of_most_frequent_item;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class Kata {
    static int mostFrequentItemCount(int[] collection) {
        HashMap<Integer, Integer> occurances = new HashMap<>();
        Arrays.stream(collection).forEach(item -> {
            if (occurances.containsKey(item))
                occurances.put(item, occurances.get(item) + 1);
            else
                occurances.put(item, 1);
        });
        int maxKey = Integer.MIN_VALUE;
        int maxValue = 0;
        for (Map.Entry<Integer, Integer> entry : occurances.entrySet()) {
            if (maxValue < entry.getValue()) {
                maxValue = entry.getValue();
                maxKey = entry.getKey();
            }
        }
        return maxKey == Integer.MIN_VALUE ? 0 : occurances.get(maxKey);
    }
}
