package pythagorean_triple;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {
    static int[] p1={3,4,5};
    static int[] p2={3,5,7};

    Kata kata = new Kata();

    @Test
    public void validTriple() {
        assertEquals(1, kata.pythagoreanTriple(p1));
    }

    @Test
    public void invalidTriple(){
        assertEquals(0, kata.pythagoreanTriple(p2));
    }
}
