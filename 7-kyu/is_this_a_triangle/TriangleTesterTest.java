package is_this_a_triangle;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TriangleTesterTest {
    @Test
    public void publicTests() {
        assertEquals(true, TriangleTester.isTriangle(1,2,2));
        assertEquals(false, TriangleTester.isTriangle(7,2,2));
    }
}
