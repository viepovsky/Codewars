package jaden_casing_strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

class JadenCaseTest {


    JadenCase jadenCase = new JadenCase();

    @Test
    void test() {
        assertEquals("Most Trees Are Blue", jadenCase.toJadenCase("most trees are blue"));
    }

    @Test
    void testNullArg() {
        assertNull(jadenCase.toJadenCase(null));
    }

    @Test
    void testEmptyArg() {
        assertNull(jadenCase.toJadenCase(""));
    }

}
