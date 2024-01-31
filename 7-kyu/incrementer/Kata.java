package incrementer;

import java.util.stream.IntStream;

class Kata {
    public static int[] incrementer(int[] numbers) {
        return IntStream.range(0, numbers.length)
                        .map(n -> increment(numbers[n], n + 1))
                        .map(Kata::getLastDigitOfNumber)
                        .toArray();
    }

    private static int increment(int number, int by) {
        return number + by;

    }

    private static int getLastDigitOfNumber(int number) {
        return number % 10;
    }
}
