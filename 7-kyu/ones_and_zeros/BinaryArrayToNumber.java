package ones_and_zeros;

import java.util.List;
import java.util.stream.Collectors;

class BinaryArrayToNumber {
    static int ConvertBinaryArrayToInt(List<Integer> binary) {
        return Integer.parseInt(binary.stream().map(String::valueOf).collect(Collectors.joining()), 2);
    }
}
