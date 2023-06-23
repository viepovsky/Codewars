package get_character_from_ASCII_value;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class AsciiTest {
    @Test
    void testChar() {
        assertEquals('7', Ascii.getChar(55));
        assertEquals('8', Ascii.getChar(56));
        assertEquals('9', Ascii.getChar(57));
        assertEquals(':', Ascii.getChar(58));
        assertEquals(';', Ascii.getChar(59));
        assertEquals('<', Ascii.getChar(60));
        assertEquals('=', Ascii.getChar(61));
        assertEquals('>', Ascii.getChar(62));
        assertEquals('?', Ascii.getChar(63));
        assertEquals('@', Ascii.getChar(64));
        assertEquals('A', Ascii.getChar(65));
        assertEquals( 0, Character.compare('!', Ascii.getChar(33)));
    }
}
