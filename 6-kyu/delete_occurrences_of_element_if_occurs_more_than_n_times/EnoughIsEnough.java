package delete_occurrences_of_element_if_occurs_more_than_n_times;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class EnoughIsEnough {
    static int[] deleteNth(int[] elements, int maxOccurrences) {
        Map<Integer, Integer> occurredElements = new HashMap<>();
        List<Integer> result = new ArrayList<>();
        if (maxOccurrences != 0) {
            for (int element : elements) {
                if (occurredElements.containsKey(element)) {
                    int times = occurredElements.get(element);
                    if (times < maxOccurrences) {
                        result.add(element);
                        occurredElements.replace(element, ++times);
                    }
                } else {
                    result.add(element);
                    occurredElements.put(element, 1);
                }
            }
        }
        return result.stream().mapToInt(Integer::intValue).toArray();
    }
}
