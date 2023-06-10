package counting_duplicates;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

class CountingDuplicates {
    static int duplicateCount(String text) {
        List<Character> duplicateList = new ArrayList<>();
        text = text.toLowerCase();
        for (int i = 0; i < text.length(); i++) {
            for (int j = i + 1; j < text.length(); j++) {
                if (Objects.equals(text.charAt(i), text.charAt(j))) {
                    if(!duplicateList.contains(text.charAt(i))){
                        duplicateList.add(text.charAt(i));
                    }
                }
            }
        }
        return duplicateList.size();
    }
}
