package how_many_arguments;

import java.util.Arrays;

class Kata {
    static int countArgs(Object... args) {
        return (int) Arrays.stream(args).count();
    }
}
