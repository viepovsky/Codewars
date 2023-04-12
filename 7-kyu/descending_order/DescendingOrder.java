package descending_order;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class DescendingOrder {
    public static int sortDesc(final int num) {
        List<Integer> integers = new ArrayList<>();
        for (int i = 0; i < String.valueOf(num).length(); i++) {
            integers.add(Character.getNumericValue(String.valueOf(num).charAt(i)));
        }
        integers.sort(Collections.reverseOrder());
        StringBuilder result = new StringBuilder();
        integers.forEach(result::append);
        return Integer.parseInt(result.toString());
    }
}
