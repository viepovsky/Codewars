package hex_to_decimal;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {
    @Test
    void examples() {
        // assertEquals("expected", "actual");
        assertEquals(1, Kata.hexToDec("1"));
        assertEquals(10, Kata.hexToDec("a"));
        assertEquals(16, Kata.hexToDec("10"));
        assertEquals(255, Kata.hexToDec("FF"));
        assertEquals(-12, Kata.hexToDec("-C"));
    }
}
