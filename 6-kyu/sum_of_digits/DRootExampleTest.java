package sum_of_digits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class DRootExampleTest {
    @Test
    void Test1() {
        assertEquals(7, DRoot.digital_root(16));
    }
    @Test
    void Test2() {
        assertEquals(6, DRoot.digital_root(456));
    }
}
