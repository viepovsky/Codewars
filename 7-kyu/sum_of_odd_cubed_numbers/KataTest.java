package sum_of_odd_cubed_numbers;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {
    @Test
    void testSomething() {

        assertEquals(0, Kata.cubeOdd(new int[] {-5, -5, 5, 5}));
        assertEquals(28, Kata.cubeOdd(new int[] {1, 2, 3, 4}));
        assertEquals(0, Kata.cubeOdd(new int[] {-3, -2, 2, 3}));

    }
}
