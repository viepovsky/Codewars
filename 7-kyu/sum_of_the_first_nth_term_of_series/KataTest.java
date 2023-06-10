package sum_of_the_first_nth_term_of_series;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {
    @Test
    void test1() {
        assertEquals("1.57", Kata.seriesSum(5));
    }
    @Test
    void test2() {
        assertEquals("1.77", Kata.seriesSum(9));
    }
    @Test
    void test3() {
        assertEquals("1.94", Kata.seriesSum(15));
    }
}
