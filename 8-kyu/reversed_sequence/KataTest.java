package reversed_sequence;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class KataTest {
    @Test
    public void simpleTest() {
        assertArrayEquals(new int[]{5,4,3,2,1},Kata.reverse(5));
    }
}
