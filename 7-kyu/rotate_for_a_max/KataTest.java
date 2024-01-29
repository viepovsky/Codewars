package rotate_for_a_max;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {
    private static void testing(long actual, long expected) {
        assertEquals(expected, actual);
    }
    @Test
    void test() {
        System.out.println("Fixed Tests maxRot");
        testing(Kata.maxRot(38458215), 85821534);
        testing(Kata.maxRot(195881031), 988103115);
        testing(Kata.maxRot(896219342), 962193428);
        testing(Kata.maxRot(69418307), 94183076);
    }
}
