package grasshopper_basic_function_fixer;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void testAddFive() {
        assertEquals(10, Solution.addFive(5));
    }
    @Test
    void testAddZero() {
        assertEquals(5, Solution.addFive(0));
    }
    @Test
    void testAddNegativeFive() {
        assertEquals(0, Solution.addFive(-5));
    }
    @Test
    void testRandom() {
        for (int i = 0; i < 50; i++) {
            int rand = (int)(Math.random() * 1000) + 1;
            assertEquals(rand+5, Solution.addFive(rand));
        }
    }
}
