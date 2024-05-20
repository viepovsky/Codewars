package number_of_decimal_digits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {
    @Test
    void Digits() {
        assertEquals(1,  Kata.Digits(5l));
        assertEquals(5,  Kata.Digits(12345l));
        assertEquals(10, Kata.Digits(9876543210l));
    }
}
