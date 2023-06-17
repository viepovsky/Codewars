package grasshopper_summation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GrassHopperTest {
    @Test
    void test1() {
        assertEquals(1,
                GrassHopper.summation(1));
    }
    @Test
    void test2() {
        assertEquals(36,
                GrassHopper.summation(8));
    }
}
