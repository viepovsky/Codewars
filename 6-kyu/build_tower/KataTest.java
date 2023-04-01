package build_tower;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {
    @Test
    public void basicTests() {
        assertEquals("[]", Arrays.toString(Kata.towerBuilder(0)));
        assertEquals(String.join(",", "*"), String.join(",", Kata.towerBuilder(1)));
        assertEquals(String.join(",", " * ", "***"), String.join(",", Kata.towerBuilder(2)));
        assertEquals(String.join(",", "  *  ", " *** ", "*****"), String.join(",", Kata.towerBuilder(3)));
    }
}
