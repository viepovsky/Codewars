package number_of_trailing_zeros_of_n_factorial;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {
    @Test
    void testZeros() {
        assertEquals(0, Kata.zeros(0));
        assertEquals(1, Kata.zeros(6));
        assertEquals(2, Kata.zeros(14));
        assertEquals(9, Kata.zeros(40));
        assertEquals(24, Kata.zeros(100));
        assertEquals(49, Kata.zeros(200));
        assertEquals(124, Kata.zeros(500));
        assertEquals(142, Kata.zeros(575));
        assertEquals(150, Kata.zeros(612));
        assertEquals(152, Kata.zeros(622));
        assertEquals(152, Kata.zeros(624));
        assertEquals(156, Kata.zeros(625));
        assertEquals(156, Kata.zeros(627));
        assertEquals(157, Kata.zeros(631));
        assertEquals(162, Kata.zeros(650));
        assertEquals(199, Kata.zeros(800));
        assertEquals(224, Kata.zeros(900));
        assertEquals(246, Kata.zeros(999));
        assertEquals(249, Kata.zeros(1000));
    }
}
