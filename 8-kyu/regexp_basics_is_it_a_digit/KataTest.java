package regexp_basics_is_it_a_digit;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class KataTest {
    @Test
    void fixedTests() {
        assertFalse(Kata.isDigit(""));
        assertTrue(Kata.isDigit("7"));
        assertFalse(Kata.isDigit(" "));
        assertFalse(Kata.isDigit("a"));
        assertFalse(Kata.isDigit("a5"));
        assertFalse(Kata.isDigit("14"));
    }
}
