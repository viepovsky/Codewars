package exes_and_ohs;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {
    @Test
    void testSomething1() {
        assertEquals(true, XO.getXO("xxxooo"));
    }

    @Test
    void testSomething2() {
        assertEquals(true, XO.getXO("xxxXooOo"));
    }

    @Test
    void testSomething3() {
        assertEquals(false, XO.getXO("xxx23424esdsfvxXXOOooo"));
    }

    @Test
    void testSomething4() {
        assertEquals(false, XO.getXO("xXxxoewrcoOoo"));
    }

    @Test
    void testSomething5() {
        assertEquals(false, XO.getXO("XxxxooO"));
    }

    @Test
    void testSomething6() {
        assertEquals(true, XO.getXO("zssddd"));
    }

    @Test
    void testSomething7() {
        assertEquals(false, XO.getXO("Xxxxertr34"));
    }
}
