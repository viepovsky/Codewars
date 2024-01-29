package currying_functions_multiply_all_elements_in_array;

import java.util.function.IntFunction;
import java.util.stream.IntStream;

class Kata {
    private final int[] array;

    Kata(int[] array) {
        this.array = array;
    }

    int[] apply(int value) {
        return IntStream.of(array)
                        .map(x -> x * value)
                        .toArray();
    }

    static Kata multiplyAll(int[] array) {
        return new Kata(array);
    }
}

class Kata2 {
    static IntFunction<int[]> multiplyAll(int[] array){
        return value -> IntStream.of(array)
                                 .map(x -> x * value)
                                 .toArray();
    }
}


