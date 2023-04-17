package playing_with_digits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DigPowTest {
    @Test
    public void Test1() {
        assertEquals(1, DigPow.digPow(89, 1));
    }
    @Test
    public void Test2() {
        assertEquals(-1, DigPow.digPow(92, 1));
    }
    @Test
    public void Test3() {
        assertEquals(51, DigPow.digPow(46288, 3));
    }
}
