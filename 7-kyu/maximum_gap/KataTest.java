package maximum_gap;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {
    @Test
    void Check_Positive_Values()
    {
        assertEquals(  4, Kata.maxGap(new int[]{13,10,2,9,5}));
        assertEquals(  8, Kata.maxGap(new int[]{13,3,5}));
        assertEquals(168, Kata.maxGap(new int[]{24,299,131,14,26,25}));
    }
    @Test
    void Check_Negative_Values()
    {
        assertEquals( 23, Kata.maxGap(new int[]{-3,-27,-4,-2}));
        assertEquals(767, Kata.maxGap(new int[]{-7,-42,-809,-14,-12}));
    }
    @Test
    void Check_Mixed_Values()
    {
        assertEquals(278, Kata.maxGap(new int[]{12,-5,-7,0,290}));
        assertEquals(576, Kata.maxGap(new int[]{-54,37,0,64,-15,640,0}));
    }
}
