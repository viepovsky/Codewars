package simple_beads_count;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {
    @Test
    void test0() {
        assertEquals(0, BeadsCounter.countRedBeads(0));
    }
    @Test
    void test1() {
        assertEquals(0, BeadsCounter.countRedBeads(1));
    }
    @Test
    void test3() {
        assertEquals(4, BeadsCounter.countRedBeads(3));
    }
    @Test
    void test5() {
        assertEquals(8, BeadsCounter.countRedBeads(5));
    }
}
