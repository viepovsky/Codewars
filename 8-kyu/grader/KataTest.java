package grader;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class KataTest {
    @Test
    void sampleTests() {
        assertEquals("C", Kata.grader(0.7));
        assertEquals("A", Kata.grader(0.9));
        assertEquals("D", Kata.grader(0.6));
        assertEquals("F", Kata.grader(1.1), "1.1 is greater than 1 the grade should be \"F\"");
    }
}
