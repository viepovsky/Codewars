package triangular_treasure;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class TriangularTest {
    @Test
    void fixedTests(){
        assertEquals(3, Triangular.triangular(2));
        assertEquals(10, Triangular.triangular(4));
        assertEquals(813450, Triangular.triangular(1275));
        assertEquals(0, Triangular.triangular(0));
        assertEquals(0, Triangular.triangular(-1));
    }
}
