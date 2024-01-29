package sum_of_differences_in_array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {
    @Test
    void basicTests() {
        assertEquals(9, Kata.sumOfDifferences(new int[]{1, 2, 10}));
        assertEquals(2, Kata.sumOfDifferences(new int[]{-3, -2, -1}));
        assertEquals(0, Kata.sumOfDifferences(new int[]{1, 1, 1, 1, 1}));
        assertEquals(34, Kata.sumOfDifferences(new int[]{-17, 17}));
        assertEquals(0, Kata.sumOfDifferences(new int[0]));
        assertEquals(0, Kata.sumOfDifferences(new int[]{0}));
        assertEquals(0, Kata.sumOfDifferences(new int[]{-1}));
        assertEquals(0, Kata.sumOfDifferences(new int[]{1}));
    }
}
