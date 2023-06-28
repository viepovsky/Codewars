package basic_mathematical_operations;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {
    @Test
    void testBasics()
    {
        System.out.println("Basic Tests");
        assertEquals(11, BasicOperations.basicMath("+", 4, 7));
    }
}
