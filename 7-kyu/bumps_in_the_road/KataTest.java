package bumps_in_the_road;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {
    @Test
    void basicTest() {
        assertEquals("Woohoo!", Kata.bumps("n"));
        assertEquals("Woohoo!", Kata.bumps("__nn_nnnn__n_n___n____nn__nnn"));
        assertEquals("Woohoo!", Kata.bumps("nnn_n__n_n___nnnnn___n__nnn__"));
        assertEquals("Car Dead", Kata.bumps("_nnnnnnn_n__n______nn__nn_nnn"));
        assertEquals("Woohoo!", Kata.bumps("______n___n_"));
        assertEquals("Car Dead", Kata.bumps("nnnnnnnnnnnnnnnnnnnnn"));
    }
}
