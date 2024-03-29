package row_weights;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class KataTest {
    @Test
    void Basic_Tests()
    {
        assertArrayEquals(new int[]{80,0}, Kata.rowWeights(new int[]{80}));
        assertArrayEquals(new int[]{100,50}, Kata.rowWeights(new int[]{100,50}));
        assertArrayEquals(new int[]{120,140}, Kata.rowWeights(new int[]{50,60,70,80}));
    }
    @Test
    void Odd_Vector_Length()
    {
        assertArrayEquals(new int[]{62,27}, Kata.rowWeights(new int[]{13,27,49}));
        assertArrayEquals(new int[]{236,92}, Kata.rowWeights(new int[]{70,58,75,34,91}));
        assertArrayEquals(new int[]{211,164}, Kata.rowWeights(new int[]{29,83,67,53,19,28,96}));
    }
    @Test
    void Even_Vector_Length()
    {
        assertArrayEquals(new int[]{100,50}, Kata.rowWeights(new int[]{100,50}));
        assertArrayEquals(new int[]{150,151}, Kata.rowWeights(new int[]{100,51,50,100}));
        assertArrayEquals(new int[]{207,235}, Kata.rowWeights(new int[]{39,84,74,18,59,72,35,61}));
    }
}
