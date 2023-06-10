package return_negative;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {
    @Test
    void test1() {
        assertEquals(-42, Kata.makeNegative(42));
    }
}
