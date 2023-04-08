package switch_it_up;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {
    @Test
    public void basicTests() {
        assertEquals("One", Kata.switchItUp(1));
        assertEquals("Three", Kata.switchItUp(3));
        assertEquals("Five", Kata.switchItUp(5));
    }
}
