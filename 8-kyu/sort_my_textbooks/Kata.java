package sort_my_textbooks;

import java.util.List;

class Kata {
    public static List<String> sort(List<String> textbooks) {
        textbooks.sort((string1, string2) -> {
            int compare = string1.compareToIgnoreCase(string2);
            if (compare != 0) {
                return compare;
            } else {
                return string1.compareTo(string2);
            }
        });
        return textbooks;
    }
}
