package find_min_and_max;

import java.util.List;

class Kata {
    static int[] getMinMax(List<Integer> list) {
        list.sort(Integer::compareTo);
        int min = list.get(0);
        int max = list.get(list.size() - 1);
        return new int[]{min, max};
    }
}
