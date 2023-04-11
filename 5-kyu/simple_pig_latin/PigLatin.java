package simple_pig_latin;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class PigLatin {
    public static String pigIt(String str) {
        List<String> strings = Arrays.stream(str.split(" ")).toList();
        return strings.stream()
                .map(n -> {
                    if (!n.contains("!") && !n.contains("?")) {
                        return n.substring(1) + n.charAt(0) + "ay";
                    }
                    return n;
                })
                .collect(Collectors.joining(" "));
    }
}
