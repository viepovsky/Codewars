package sort_arrays_1;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {
    @Test
    void intArrayTests() {
        int[] ai={1,2,3};
        int[] uai={2,3,1};
        assertEquals(ai[0], Kata.sortArray(uai)[0]);
        assertEquals(ai[1], Kata.sortArray(uai)[1]);
        assertEquals(ai[2], Kata.sortArray(uai)[2]);
    }
}
