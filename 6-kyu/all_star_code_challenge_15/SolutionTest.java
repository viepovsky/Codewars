package all_star_code_challenge_15;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void testSomething() {
        String[] actual = new ScrollingTextMachine().rotate("Hello");
        assertEquals(5, actual.length);
        assertEquals("elloH", actual[0]);
        assertEquals("lloHe", actual[1]);
        assertEquals("loHel", actual[2]);
        assertEquals("oHell", actual[3]);
        assertEquals("Hello", actual[4]);
    }

    @Test
    void testSomething2() {
        String[] actual = new ScrollingTextMachine().rotate(" ");
        assertEquals(1, actual.length);
        assertEquals(" ", actual[0]);
    }
}
