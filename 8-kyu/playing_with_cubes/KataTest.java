package playing_with_cubes;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {
    @Test
    public void testSetToThree() {
        Kata k = new Kata();
        k.setSide(3);
        assertEquals(3, k.getSide());
    }
}
