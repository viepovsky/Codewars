package the_old_switcheroo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {

    @Test
    void test1() {
        assertEquals("th3s 6s my str15ng", Kata.vowel2Index("this is my string"));
    }

    @Test
    void test2() {
        assertEquals("C2d4w6rs 10s th15 b18st s23t25 27n th32 w35rld", Kata.vowel2Index("Codewars is the best site in the world"));
    }
    @Test
    void test3() {
        assertEquals("T2m4rr7w 10s g1415ng t20 b23 r2627n29ng", Kata.vowel2Index("Tomorrow is going to be raining"));
    }
    @Test
    void test4() {
        assertEquals("", Kata.vowel2Index(""));
    }
}
