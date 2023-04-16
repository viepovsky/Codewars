package last_digit_of_a_large_number;

import org.junit.jupiter.api.Test;

import java.math.BigInteger;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {
    @Test
    public void testSomething() {
        assertEquals(8, Kata.lastDigit(new BigInteger("2"), new BigInteger("7")));
        assertEquals(4, Kata.lastDigit(new BigInteger("4"), new BigInteger("1")));
        assertEquals(6, Kata.lastDigit(new BigInteger("4"), new BigInteger("2")));
        assertEquals(9, Kata.lastDigit(new BigInteger("9"), new BigInteger("7")));
        assertEquals(6, Kata.lastDigit(new BigInteger("1800488698"), new BigInteger("1534099168")));
        assertEquals(1, Kata.lastDigit(new BigInteger("880703"), new BigInteger("902456")));
        assertEquals(3, Kata.lastDigit(new BigInteger("1185943097"), new BigInteger("1853373055")));
        assertEquals(6, Kata.lastDigit(new BigInteger("1487219064"), new BigInteger("1779818870")));
    }
}
