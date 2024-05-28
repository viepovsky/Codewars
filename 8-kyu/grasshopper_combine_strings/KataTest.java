package grasshopper_combine_strings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {
    @Test
    void test() {
        assertEquals("James Stevens",
                Kata.combineNames("James","Stevens"));
    }
}
