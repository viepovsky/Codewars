package enumerable_magic_1_true_for_all;

import java.util.Arrays;
import java.util.function.IntPredicate;

class Solution {
    public static boolean all(int[] list, IntPredicate predicate){
        return Arrays.stream(list).allMatch(predicate);
    }
}
