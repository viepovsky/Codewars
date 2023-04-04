package write_number_in_expanded_form;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {
    @Test
    public void testSomething() {
        assertEquals("10 + 2", Kata.expandedForm(12));
        assertEquals("40 + 2", Kata.expandedForm(42));
        assertEquals("70000 + 300 + 4", Kata.expandedForm(70304));
        assertEquals("90000000", Kata.expandedForm(90000000));
    }
}
