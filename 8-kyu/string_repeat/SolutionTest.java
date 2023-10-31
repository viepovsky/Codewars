package string_repeat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void test4a() {
        assertEquals("aaaa", Solution.repeatStr(4, "a"));
    }
    @Test
    void test3Hello() {
        assertEquals("HelloHelloHello", Solution.repeatStr(3, "Hello"));
    }
    @Test
    void test5empty() {
        assertEquals("", Solution.repeatStr(5, ""));
    }
    @Test
    void test0kata() {
        assertEquals("", Solution.repeatStr(0, "kata"));
    }
}
