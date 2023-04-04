package odd_or_even;

import java.util.stream.IntStream;

public class Codewars {
    public static String oddOrEven (int[] array) {
//        List<Integer> integers = Arrays.stream(array).boxed().toList();
//        return Math.abs(integers.stream().mapToInt(Integer::intValue).sum()) % 2 == 0 ? "even" : "odd"; <- this is also mine, with usage of List<Integer>
        return Math.abs(IntStream.of(array).sum()) % 2 == 0 ? "even" : "odd";
    }
}
