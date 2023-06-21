package exclamation_mark_series_11;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void basicTests() {
        assertEquals("H!!",      Solution.replace("Hi!"));
        assertEquals("!H!! H!!", Solution.replace("!Hi! Hi!"));
        assertEquals("!!!!!",    Solution.replace("aeiou"));
        assertEquals("!BCD!",    Solution.replace("ABCDE"));
    }
}
