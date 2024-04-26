package how_many_arguments;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {
    @Test
    void sampleTest() {
        assertEquals(3, Kata.countArgs(1, 2, 3));
        assertEquals(3, Kata.countArgs(1, 2, "uhsaf uas"));
        assertEquals(1, Kata.countArgs(1));
        assertEquals(4, Kata.countArgs('a', 865, "asfhgajsf", new BigInteger("123456")));
        assertEquals(0, Kata.countArgs());
    }
}
