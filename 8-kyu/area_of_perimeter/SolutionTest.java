package area_of_perimeter;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void testSomething() {
        assertEquals(16, Solution.areaOrPerimeter(4 , 4));
        assertEquals(32, Solution.areaOrPerimeter(6 , 10));
    }
}
