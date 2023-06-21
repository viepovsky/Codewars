package you_are_a_square;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SquareTest {
    @Test
    void shouldWorkForSomeExamples() throws Exception {
        assertFalse(Square.isSquare(-1));
        assertTrue(Square.isSquare(0));
        assertFalse(Square.isSquare(3));
        assertTrue(Square.isSquare(4));
        assertTrue(Square.isSquare(25));
        assertFalse(Square.isSquare(26));
    }
}
