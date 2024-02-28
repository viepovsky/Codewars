package indexed_capitalization;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {
    @Test
    void basicTest(){
        assertEquals("aBCdeF", Kata.capitalize("abcdef", new int[]{1,2,5}));
        assertEquals("aBCdeF", Kata.capitalize("abcdef", new int[]{1,2,5,100}));
        assertEquals("cOdEwArs", Kata.capitalize("codewars", new int[]{1,3,5,50}));
        assertEquals("abRacaDabRA", Kata.capitalize("abracadabra", new int[]{2,6,9,10}));
        assertEquals("codewArriors", Kata.capitalize("codewarriors", new int[]{5}));
    }
}
