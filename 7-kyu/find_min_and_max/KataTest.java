package find_min_and_max;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class KataTest {
    @Test
    void sampleTests() {
        assertArrayEquals(new int[] {1, 1}, Kata.getMinMax(Arrays.asList(1)),     "input: [1]");
        assertArrayEquals(new int[] {1, 2}, Kata.getMinMax(Arrays.asList(1, 2)),  "input: [1, 2]");
        assertArrayEquals(new int[] {1, 2}, Kata.getMinMax(Arrays.asList(2, 1)),  "input: [2, 1]");
    }
}
