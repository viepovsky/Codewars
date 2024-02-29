package disarium_number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {
    @Test
    void Disarium_Or_NOT()
    {
        assertEquals("Disarium !!", Kata.disariumNumber(89));
        assertEquals("Not !!", Kata.disariumNumber(564));
        assertEquals("Not !!", Kata.disariumNumber(1024));
    }
    @Test
    void Larger_Numbers()
    {
        assertEquals("Not !!", Kata.disariumNumber(64599));
        assertEquals("Not !!", Kata.disariumNumber(136586));
        assertEquals("Not !!", Kata.disariumNumber(1048576));
    }
}
