package parse_nice_int_from_char_problem;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CharProblemTest {
    @Test
    void test1() {
        assertEquals(5, CharProblem.howOld("5 years old"));
    }
    @Test
    void test2() {
        assertEquals(9, CharProblem.howOld("9 years old"));
    }
    @Test
    void test3() {
        assertEquals(1, CharProblem.howOld("1 year old"));
    }
}
