package find_the_next_perfect_square;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberFunTest {
    @Test
    void test1() {
        assertEquals(144, NumberFun.findNextSquare(121));
    }

    @Test
    void test2() {
        assertEquals(676, NumberFun.findNextSquare(625));
    }

    @Test
    void test3() {
        assertEquals(-1, NumberFun.findNextSquare(114));
    }
}
