package sum_mixed_array;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {
    MixedSum mixedSum = new MixedSum();

    @Test
    void test_1() {
        assertEquals(10, mixedSum.sum(Arrays.asList(5,"5")));
    }

    @Test
    public void test_2() {
        assertEquals(22, mixedSum.sum(Arrays.asList(9, 3, "7", "3")));
    }

    @Test
    public void test_3() {
        assertEquals(42, mixedSum.sum(Arrays.asList("5", "0", 9, 3, 2, 1, "9", 6, 7)));
    }

    @Test
    public void test_4() {
        assertEquals(41, mixedSum.sum(Arrays.asList("3", 6, 6, 0, "5", 8, 5, "6", 2, "0")));
    }

    @Test
    public void test_5() {
        assertEquals(45, mixedSum.sum(Arrays.asList("1", "5", "8", 8, 9, 9, 2, "3")));
    }

    @Test
    public void test_6() {
        assertEquals(41, mixedSum.sum(Arrays.asList("3", 6, 6, 0, "5", 8, 5, "6", 2, "0")));
    }

    @Test
    public void test_7() {
        assertEquals(61, mixedSum.sum(Arrays.asList(8, 0, 0, 8, 5, 7, 2, 3, 7, 8, 6, 7)));
    }
}
