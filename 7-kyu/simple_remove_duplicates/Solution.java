package simple_remove_duplicates;

import java.util.*;

public class Solution {
    public static int [] solve(int [] arr){
        Set<Integer> occurrences = new HashSet<>();
        List<Integer> result = new ArrayList<>();
        for (int i = arr.length - 1; i >= 0; i--) {
            if (!occurrences.contains(arr[i])) {
                result.add(arr[i]);
                occurrences.add((arr[i]));
            }
        }
        Collections.reverse(result);
        return result.stream().mapToInt(i -> i).toArray();
    }
}
