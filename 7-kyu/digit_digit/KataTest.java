package digit_digit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {
    @Test
    void test() {
        assertEquals(811181, Kata.squareDigits(9119));
        assertEquals(0, Kata.squareDigits(0));
    }
}
