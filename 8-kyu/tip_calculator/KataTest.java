package tip_calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class KataTest {
    @Test
    public void test1() {
        assertEquals(2, Kata.calculateTip(30d, "poor"));
    }

    @Test
    public void test2() {
        assertEquals(4, Kata.calculateTip(20d, "Excellent"));
    }

    @Test
    public void test3() {
        assertNull(Kata.calculateTip(20d, "hi"));
    }

    @Test
    public void test4() {
        assertEquals(17, Kata.calculateTip(107.65, "GReat"));
    }
}
