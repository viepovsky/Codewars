package grasshopper_summation;

import java.util.stream.IntStream;

class GrassHopper {
    static int summation(int n) {
        return IntStream.rangeClosed(1, n).sum();
    }
}
