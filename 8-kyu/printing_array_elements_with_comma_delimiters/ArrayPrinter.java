package printing_array_elements_with_comma_delimiters;

import java.util.Arrays;

class ArrayPrinter {
    static String printArray(Object[] array) {
        return Arrays.stream(array).reduce((i,k) -> i + "," + k).get().toString();
    }
}
