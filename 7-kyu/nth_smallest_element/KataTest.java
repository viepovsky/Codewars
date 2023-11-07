package nth_smallest_element;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {
    @Test
    void checkPositiveValues() {
        doTest(new int[]{3, 1, 2}, 2, 2);
        doTest(new int[]{15, 20, 7, 10, 4, 3}, 3, 7);
    }
    @Test
    void checkNegativeValues() {
        doTest(new int[]{-5, -1, -6, -18}, 4, -1);
        doTest(new int[]{-102, -16, -1, -2, -367, -9}, 5, -2);
    }
    @Test
    void checkMixedValues() {
        doTest(new int[]{2, 169, 13, -5, 0, -1}, 4, 2);
        doTest(new int[]{177, 225, 243, -169, -12, -5, 2, 92}, 5, 92);
    }
    private void doTest(final int[] arr, final int n, final int expected) {
        assertEquals(expected, Kata.nthSmallest(arr, n));
    }
}
