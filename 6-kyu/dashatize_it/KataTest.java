package dashatize_it;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {
    @Test
    void testBasic() {
        assertEquals("2-7-4", Kata.dashatize(274));
        assertEquals("5-3-1-1", Kata.dashatize(5311));
        assertEquals("86-3-20", Kata.dashatize(86320));
        assertEquals("9-7-4-3-02", Kata.dashatize(974302));
    }

    @Test
    void testWeird() {
        assertEquals("0", Kata.dashatize(0));
        assertEquals("1", Kata.dashatize(-1));
        assertEquals("28-3-6-9", Kata.dashatize(-28369));
    }

    @Test
    void testEdgeCases() {
        assertEquals("2-1-4-7-48-3-64-7", Kata.dashatize(Integer.MAX_VALUE));
        assertEquals("2-1-4-7-48-3-648", Kata.dashatize(Integer.MIN_VALUE));
        assertEquals("1-1-1-1-1-1-1-1-1-1", Kata.dashatize(-1111111111));
    }
}
