package factorial.java;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {
    @Test
    void testSomething() {
        assertEquals(1L, Kata.factorial(0));
        assertEquals(1L, Kata.factorial(1));
        assertEquals(24L, Kata.factorial(4));
        assertEquals(5040L, Kata.factorial(7));
    }
}
