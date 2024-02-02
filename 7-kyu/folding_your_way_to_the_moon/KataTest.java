package folding_your_way_to_the_moon;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {
    @Test
    void sampleTests() {
        assertEquals((Long)42L, Kata.fold(384000000.0));
        assertEquals((Long)0L, Kata.fold(0.00005));
        assertEquals((Long)4L, Kata.fold(0.001492632534782833));
    }
}
