package third_angle_of_triangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {
    @Test
    void testOtherAngle() {
        assertEquals(123, Kata.otherAngle(45,12));
        assertEquals(70, Kata.otherAngle(50,60));
    }
}

