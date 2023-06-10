package reversed_sequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class KataTest {
    @Test
    void simpleTest() {
        assertArrayEquals(new int[]{5,4,3,2,1},Kata.reverse(5));
    }
}
