package return_negative;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {
    @Test
    public void test1() {
        assertEquals(-42, Kata.makeNegative(42));
    }
}
