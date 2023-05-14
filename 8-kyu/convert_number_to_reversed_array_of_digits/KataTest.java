package convert_number_to_reversed_array_of_digits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class KataTest {
    @Test
    public void tests() {
        assertArrayEquals(new int[] {1, 3, 2, 5, 3}, Kata.digitize(35231));
        assertArrayEquals(new int[] {0}, Kata.digitize(0));
    }
}
