package count_the_digit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CountDigTest {
    private static void testing(int actual, int expected) {
        assertEquals(expected, actual);
    }
    @Test
    void test() {
        System.out.println("Fixed Tests nbDig");
        testing(CountDig.nbDig(5750, 0), 4700);
        testing(CountDig.nbDig(11011, 2), 9481);
        testing(CountDig.nbDig(12224, 8), 7733);
        testing(CountDig.nbDig(11549, 1), 11905);
    }
}
