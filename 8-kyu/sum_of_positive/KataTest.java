package sum_of_positive;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {
    @Test
    void testSomething() {
        assertEquals(15, Kata.sum(new int[]{1,2,3,4,5}));
        assertEquals(13, Kata.sum(new int[]{1,-2,3,4,5}));
        assertEquals(0, Kata.sum(new int[]{}));
        assertEquals(0, Kata.sum(new int[]{-1,-2,-3,-4,-5}));
        assertEquals(9, Kata.sum(new int[]{-1,2,3,4,-5}));
    }
}
