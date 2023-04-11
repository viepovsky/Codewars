package convert_a_boolean_to_a_string;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class KataTest {
    @Test
    void testTrue(){
        assertEquals("true", Kata.convert(true));
    }

    @Test void testFalse(){
        assertEquals("false", Kata.convert(false));
    }
}
