package filter_the_number;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {
    @Test
    void exampleTests() {
        assertEquals(Kata.filterString("123"), 123);
        assertEquals(Kata.filterString("a1b2c3"), 123);
        assertEquals(Kata.filterString("aa1bb2cc3dd"), 123);
    }
}
