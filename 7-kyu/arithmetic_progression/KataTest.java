package arithmetic_progression;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {
    @Test
    void shouldPassFixedTests() {
        assertEquals("1, 2, 3, 4, 5, 6, 7, 8, 9, 10", Kata.arithmeticSequenceElements(1, 1, 10));
        assertEquals("1, 3, 5, 7, 9", Kata.arithmeticSequenceElements(1, 2, 5));
        assertEquals("1, 1, 1, 1, 1", Kata.arithmeticSequenceElements(1, 0, 5));
        assertEquals("1, -2, -5, -8, -11, -14, -17, -20, -23, -26", Kata.arithmeticSequenceElements(1, -3, 10));
        assertEquals("100, 90, 80, 70, 60, 50, 40, 30, 20, 10", Kata.arithmeticSequenceElements(100, -10, 10));
    }
}
