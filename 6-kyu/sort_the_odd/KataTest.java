package sort_the_odd;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class KataTest {
    @Test
    void exampleTest1() {
        assertArrayEquals(new int[]{ 1, 3, 2, 8, 5, 4 }, Kata.sortArray(new int[]{ 5, 3, 2, 8, 1, 4 }));
    }

    @Test
    void exampleTest2() {
        assertArrayEquals(new int[]{ 1, 3, 5, 8, 0 }, Kata.sortArray(new int[]{ 5, 3, 1, 8, 0 }));
    }

    @Test
    void exampleTest3() {
        assertArrayEquals(new int[]{}, Kata.sortArray(new int[]{}));
    }
}
