package sentence_smash;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SentenceSmashTest {
    @Test
    void validate() {
        assertEquals("Bilal Djaghout", SentenceSmash.smash(new String[] { "Bilal", "Djaghout" }));
        assertEquals("hello world", SentenceSmash.smash(new String[] {"hello", "world"}));
        assertEquals("hello amazing world", SentenceSmash.smash(new String[] {"hello", "amazing", "world"}));
    }

    @Test
    void validateEmpty() {
        assertEquals("", SentenceSmash.smash(new String[] {}));
    }


    @Test
    void validateOneWord() {
        assertEquals("Bilal", SentenceSmash.smash(new String[] {"Bilal"}));
        assertEquals("Test", SentenceSmash.smash(new String[] {"Test"}));
    }

}
