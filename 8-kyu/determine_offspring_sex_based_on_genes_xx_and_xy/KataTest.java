package determine_offspring_sex_based_on_genes_xx_and_xy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {
    @Test
    void tests() {
        assertEquals("Congratulations! You're going to have a son.", Kata.chromosomeCheck("XY"));
        assertEquals("Congratulations! You're going to have a daughter.", Kata.chromosomeCheck("XX"));
    }
}
