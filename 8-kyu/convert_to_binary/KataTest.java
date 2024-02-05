package convert_to_binary;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {
    @Test
    void testToBinary() {
        assertEquals(1, Kata.toBinary(1));
        assertEquals(10, Kata.toBinary(2));
        assertEquals(11, Kata.toBinary(3));
        assertEquals(101, Kata.toBinary(5));
    }
}
