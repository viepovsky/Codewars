package collatz_conjecture_length;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void testSomething() {
        assertEquals(26L, Collatz.conjecture(100L));
        assertEquals(7L, Collatz.conjecture(10L));
        assertEquals(111L, Collatz.conjecture(500L));
        assertEquals(101L, Collatz.conjecture(1000000000L));
        assertEquals(276L, Collatz.conjecture(1000000000000000L));
    }
}
