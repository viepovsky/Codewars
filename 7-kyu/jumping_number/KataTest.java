package jumping_number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {
    @Test
    void Single_Digit_Number()
    {
        assertEquals("Jumping!!", Kata.jumpingNumber(9));
        assertEquals("Jumping!!", Kata.jumpingNumber(1));
        assertEquals("Jumping!!", Kata.jumpingNumber(7));
    }
    @Test
    void Two_Digit_Number()
    {
        assertEquals("Jumping!!", Kata.jumpingNumber(23));
        assertEquals("Jumping!!", Kata.jumpingNumber(32));
        assertEquals("Not!!", Kata.jumpingNumber(79));
        assertEquals("Jumping!!", Kata.jumpingNumber(98));
    }
    @Test
    void Larger_Numbers()
    {
        assertEquals("Jumping!!", Kata.jumpingNumber(8987));
        assertEquals("Jumping!!", Kata.jumpingNumber(4343456));
        assertEquals("Jumping!!", Kata.jumpingNumber(98789876));
    }
}
