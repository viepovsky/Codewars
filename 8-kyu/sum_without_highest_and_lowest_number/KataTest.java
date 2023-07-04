package sum_without_highest_and_lowest_number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {
    @Test
    void BasicTests() {
        assertEquals(16, Kata.sum(new int[] { 6, 2, 1, 8, 10}));
    }
}
