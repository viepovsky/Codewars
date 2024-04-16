package all_star_code_challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {
    @Test
    void fixedTests() {
        assertEquals("1 hour(s) and 0 minute(s)", Kata.toTime(3600));
        assertEquals("1 hour(s) and 0 minute(s)", Kata.toTime(3601));
        assertEquals("0 hour(s) and 58 minute(s)", Kata.toTime(3500));
        assertEquals("89 hour(s) and 51 minute(s)", Kata.toTime(323500));
        assertEquals("0 hour(s) and 0 minute(s)", Kata.toTime(0));
    }
}
