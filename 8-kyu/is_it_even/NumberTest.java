package is_it_even;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class NumberTest {
    private Number num = new Number();

    @Test
    void test() {
        assertEquals(true, num.isEven(0));
        assertEquals(false, num.isEven(0.5));
        assertEquals(false, num.isEven(1));
        assertEquals(true, num.isEven(2));
        assertEquals(true, num.isEven(-4));
    }
}
