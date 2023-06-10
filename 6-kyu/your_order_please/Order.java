package your_order_please;

import java.util.Arrays;
import java.util.List;

class Order {
    static String order(String words) {
        if (words.isEmpty()) {
            return "";
        }
        List<String> wordList = Arrays.stream(words.split(" ")).toList();
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= wordList.size(); i++) {
            int finalI = i;
            String nextWord = wordList.stream().filter(n -> n.contains(String.valueOf(finalI))).findFirst().get();
            if (i != wordList.size()) {
                result.append(nextWord).append(" ");
            } else {
                result.append(nextWord);
            }
        }
        return result.toString();
    }
}
