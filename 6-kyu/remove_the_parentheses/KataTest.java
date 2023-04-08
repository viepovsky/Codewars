package remove_the_parentheses;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {
    @Test
    public void basicTests() {
        assertEquals("exampleexample", Kata.removeParentheses("example(unwanted thing)example"));
        assertEquals("", Kata.removeParentheses("()"));
        assertEquals("", Kata.removeParentheses("(())"));
        assertEquals("", Kata.removeParentheses("(.())"));
    }
}
