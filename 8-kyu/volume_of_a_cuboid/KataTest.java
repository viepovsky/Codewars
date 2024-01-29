package volume_of_a_cuboid;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {
    private static final double delta = 0.0001;

    @Test
    void examples() {
        // assertEquals("expected", "actual");
        assertEquals(4, Kata.getVolumeOfCuboid(1, 2, 2), delta);
        assertEquals(63, Kata.getVolumeOfCuboid(6.3, 2, 5), delta);
    }
}
