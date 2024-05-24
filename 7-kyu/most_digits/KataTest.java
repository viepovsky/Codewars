package most_digits;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {
    @Test
    void exampleTest1() {
        assertEquals(100, Kata.findLongest(new int[] {1, 10, 100}));
    }

    @Test
    void exampleTest2() {
        assertEquals(9000, Kata.findLongest(new int[] {9000, 8, 800}));
    }

    @Test
    void exampleTest3() {
        assertEquals(900, Kata.findLongest(new int[]  {8, 900, 500}));
    }

    @Test
    void exampleTest4() {
        assertEquals(40000, Kata.findLongest(new int[] {3, 40000, 100}));
    }

    @Test
    void exampleTest5() {
        assertEquals(100000, Kata.findLongest(new int[] {1, 200, 100000}));
    }

    @Test
    void exampleTest6() {
        assertEquals(-10, Kata.findLongest(new int[] {-10, 1, 0, 1, 10}));
    }
}
