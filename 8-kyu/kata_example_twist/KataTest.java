package kata_example_twist;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

class KataTest {
    @Test
    public void test() {
        String[] websites = Kata.kataExampleTwist();
        assertTrue(websites.length > 0);
        assertEquals(1000, websites.length);
        boolean allCodewars = true;
        for (int i = 0; i < websites.length; i++)
            if (!"codewars".equals(websites[i])) allCodewars = false;
        assertTrue(allCodewars);
    }
}
