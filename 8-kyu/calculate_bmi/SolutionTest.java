package calculate_bmi;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void testBMI() {
        assertEquals("Normal", Calculate.bmi(80, 1.80));
    }
}

