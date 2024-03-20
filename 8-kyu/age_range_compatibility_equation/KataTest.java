package age_range_compatibility_equation;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {
    @Test
    void exampleTests(){
        assertEquals("15-20", Kata.datingRange(17));
        assertEquals("27-66", Kata.datingRange(40));
        assertEquals("14-16", Kata.datingRange(15));
        assertEquals("24-56", Kata.datingRange(35));
        assertEquals("9-11", Kata.datingRange(10));
        assertEquals("10-13", Kata.datingRange(12));
    }
}
