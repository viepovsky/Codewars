package merging_sorted_integer_arrays;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class KataTest {
    @Test
    void basicTest() {
        assertArrayEquals(new int[] { 1, 2, 3, 4, 5, 6 }, Kata.mergeArrays(new int[] { 1, 3, 5 }, new int[] { 2, 4, 6 }));
        assertArrayEquals(new int[] { 2, 4, 6, 8 }, Kata.mergeArrays(new int[] { 2, 4, 8 }, new int[] { 2, 4, 6 }));
    }
}
