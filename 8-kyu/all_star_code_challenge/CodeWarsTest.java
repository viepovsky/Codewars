package all_star_code_challenge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class CodeWarsTest {
    @Test
    void testSomething() {
        assertEquals(1, CodeWars.strCount("Hello", 'o'));
        assertEquals(2, CodeWars.strCount("Hello", 'l'));
        assertEquals(0, CodeWars.strCount("",'z'));
    }
}
