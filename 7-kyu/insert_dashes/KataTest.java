package insert_dashes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {
    @Test
    void sampleTests() {
        assertEquals("4547-9-3", Kata.insertDash(454793));
        assertEquals("123456", Kata.insertDash(123456));
        assertEquals("1003-567", Kata.insertDash(1003567));
    }
}
