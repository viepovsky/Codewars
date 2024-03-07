package compare_with_margin;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {
    @Test
    void exampleTestCases() {
        assertEquals(-1, Kata.closeCompare(4, 5));
        assertEquals(0, Kata.closeCompare(5, 5));
        assertEquals(1, Kata.closeCompare(6, 5));
        assertEquals(-1, Kata.closeCompare(-6, -5));

        assertEquals(0, Kata.closeCompare(2, 5, 3));
        assertEquals(1, Kata.closeCompare(8.1, 5, 3));
        assertEquals(-1, Kata.closeCompare(1.99, 5, 3));
    }
}
