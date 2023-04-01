package simple_multiplication;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {
    @Test
    public void test1() {
        System.out.println("Checking for Odd numbers.");
        assertEquals(9, Kata.simpleMultiplication(1));
        assertEquals(27, Kata.simpleMultiplication(3));
        assertEquals(189, Kata.simpleMultiplication(21));
        assertEquals(207, Kata.simpleMultiplication(23));
    }

    @Test
    public void test2() {
        System.out.println("Checking for Even numbers.");
        assertEquals(16, Kata.simpleMultiplication(2));
        assertEquals(32, Kata.simpleMultiplication(4));
        assertEquals(176, Kata.simpleMultiplication(22));
        assertEquals(208, Kata.simpleMultiplication(26));
    }
}
