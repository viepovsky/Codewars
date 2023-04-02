package binary_addition;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {

    @Test
    void testKata() {
        assertEquals("0", Kata.binaryAddition(0,0));
        assertEquals("1", Kata.binaryAddition(1,0));
        assertEquals("1110", Kata.binaryAddition(6,8));
        assertEquals("110111", Kata.binaryAddition(50,5));
    }
}
