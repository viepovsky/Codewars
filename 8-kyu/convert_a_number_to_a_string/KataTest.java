package convert_a_number_to_a_string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {
    @Test
    void tests() {
        assertEquals("67", Kata.numberToString(67));
        assertEquals("123", Kata.numberToString(123));
        assertEquals("999", Kata.numberToString(999));
    }
}
