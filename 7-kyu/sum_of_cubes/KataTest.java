package sum_of_cubes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {
    @Test
    void exampleTests() {
        assertEquals(1,Kata.sumCubes(1));
        assertEquals(9,Kata.sumCubes(2));
        assertEquals(36,Kata.sumCubes(3));
        assertEquals(100,Kata.sumCubes(4));
        assertEquals(3025, Kata.sumCubes(10));
        assertEquals(58155876,Kata.sumCubes(123));
    }
}
