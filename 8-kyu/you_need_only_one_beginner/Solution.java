package you_need_only_one_beginner;

import java.util.Arrays;

class Solution {
    static boolean check(Object[] a, Object x) {
        return Arrays.asList(a).contains(x);
    }
}
