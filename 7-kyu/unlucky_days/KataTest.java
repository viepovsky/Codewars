package unlucky_days;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {
    @Test
    void testSomething() {
        assertEquals(3, Kata.unluckyDays(2015));
        assertEquals(1, Kata.unluckyDays(1986));
    }
}
