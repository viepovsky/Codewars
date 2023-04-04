package odd_or_even;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CodewarsTest {
    @Test
    public void exampleTest() {
        assertEquals("even", Codewars.oddOrEven(new int[] {}));
        assertEquals("odd", Codewars.oddOrEven(new int[] {2, 5, 34, 6}));
    }
}
