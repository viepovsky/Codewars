package largest_pair_sum_in_array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {
    @Test
    public void basicTestCases(){
        assertEquals(42, Kata.largestPairSum(new int[]{10,14,2,23,19}));
        assertEquals(0, Kata.largestPairSum(new int[]{-100,-29,-24,-19,19}));
        assertEquals(10, Kata.largestPairSum(new int[]{1,2,3,4,6,-1,2}));
        assertEquals(-18, Kata.largestPairSum(new int[]{-10,-8,-16,-18,-19}));
    }
}
