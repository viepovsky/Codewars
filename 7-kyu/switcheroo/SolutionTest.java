package switcheroo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {
    @Test
    public void testSomething() {
        assertEquals("abc",Switch.switcheroo( "bac"));
        assertEquals("ccc",Switch.switcheroo("ccc"));
        assertEquals("aaabcccbaaa",Switch.switcheroo("bbbacccabbb"));
    }
}
