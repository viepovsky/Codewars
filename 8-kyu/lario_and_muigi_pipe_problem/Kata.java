package lario_and_muigi_pipe_problem;

import java.util.stream.IntStream;

class Kata {
    static int[] pipeFix(int[] numbers) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        for (int number : numbers) {
            if (number < min) min = number;
            if (number > max) max = number;
        }
        return IntStream.rangeClosed(min, max).toArray();
    }
}
