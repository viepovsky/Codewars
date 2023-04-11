package stop_gninnips_my_sdrow;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class SpinWords {

    public String spinWords(String sentence) {
        List<String> strings = Arrays.stream(sentence.split(" ")).toList();
        return strings.stream()
                .map(n -> {
                    if (n.length() >= 5) {
                        return new StringBuilder(n).reverse().toString();
                    } else {
                        return n;
                    }
            }).collect(Collectors.joining(" "));
    }
}
