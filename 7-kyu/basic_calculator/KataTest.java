package basic_calculator;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class KataTest {
    @Test
    void BasicTest() {
        assertEquals(new Double(11.2),Kata.calculate(3.2,"+", 8));
        assertEquals(new Double(-4.8),Kata.calculate(3.2,"-", 8));
        assertEquals(new Double(0.4),Kata.calculate(3.2,"/", 8));
        assertEquals(new Double(25.6),Kata.calculate(3.2,"*", 8));
        assertEquals(new Double(-3),Kata.calculate(-3,"+", 0));
        assertEquals(new Double(-3),Kata.calculate(-3,"-", 0));
        assertNull(Kata.calculate(-3, "/", 0));
        assertEquals(new Double(1),Kata.calculate(-2, "/", -2));
        assertEquals(new Double(0),Kata.calculate(-3,"*", 0));
        assertNull(Kata.calculate(-3, "w", 0));
    }
}
