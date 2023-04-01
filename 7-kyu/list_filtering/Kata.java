package list_filtering;

import java.util.List;

public class Kata {
    public static List<Object> filterList(final List<Object> list) {
        return list.stream().filter(n -> !n.getClass().equals(String.class)).toList();
    }
}
