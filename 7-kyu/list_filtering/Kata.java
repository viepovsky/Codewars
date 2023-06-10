package list_filtering;

import java.util.List;

class Kata {
    static List<Object> filterList(final List<Object> list) {
        return list.stream().filter(n -> !n.getClass().equals(String.class)).toList();
    }
}
