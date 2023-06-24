package fix_string_case;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {
    @Test
    void BasicTests() {
        assertEquals("code", Solution.solve("code"));
        assertEquals("CODE", Solution.solve("CODe"));
        assertEquals("code", Solution.solve("COde"));
        assertEquals("code", Solution.solve("Code"));
        assertEquals("", Solution.solve(""));
    }
}
