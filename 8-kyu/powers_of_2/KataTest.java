package powers_of_2;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class KataTest {
    @Test
    void testSomething() {
        assertArrayEquals(new long[]{1}, Kata.powersOfTwo(0));
        assertArrayEquals(new long[]{1,2}, Kata.powersOfTwo(1));
        assertArrayEquals(new long[]{1,2,4,8,16}, Kata.powersOfTwo(4));
    }
}
