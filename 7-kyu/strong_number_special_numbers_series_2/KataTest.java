package strong_number_special_numbers_series_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {
    private static String STRONG = "STRONG!!!!";
    private static String NOT_STRONG = "Not Strong !!";

    @Test
    void testSomething() {
        assertEquals(STRONG, Kata.isStrongNumber(1));
        assertEquals(STRONG, Kata.isStrongNumber(2));
        assertEquals(STRONG, Kata.isStrongNumber(145));
        assertEquals(NOT_STRONG, Kata.isStrongNumber(7));
        assertEquals(NOT_STRONG, Kata.isStrongNumber(93));
        assertEquals(NOT_STRONG, Kata.isStrongNumber(185));
    }
}
