package reverse_the_bits_in_an_integer;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class KataTest {
    @Test
    void fixedTests() {
        assertEquals(267, Kata.reverseBits(417));
        assertEquals(417, Kata.reverseBits(267));
        assertEquals(0, Kata.reverseBits(0));
        assertEquals(1087, Kata.reverseBits(2017));
        assertEquals(1023, Kata.reverseBits(1023));
        assertEquals(1, Kata.reverseBits(1024));
    }
}
