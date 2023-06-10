package growth_of_a_population;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class GrowthTest {
    private static void testing(int actual, int expected) {
        assertEquals(expected, actual);
    }
    @Test
    void test1() {
        System.out.println("Fixed Tests: nbYear");
        testing(Growth.nbYear(1500, 5, 100, 5000),15);
        testing(Growth.nbYear(1500000, 2.5, 10000, 2000000), 10);
        testing(Growth.nbYear(1500000, 0.25, 1000, 2000000), 94);
        testing(Growth.nbYear(1500, 0, 1000, 1000), 0);
    }
}
