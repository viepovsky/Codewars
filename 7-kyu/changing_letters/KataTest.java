package changing_letters;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {
    @Test
    void swap_1() {
        assertEquals("HEllOWOrld!",Kata.swap("HelloWorld!"));
    }

    @Test
    void swap_2() {
        assertEquals("SUndAy",Kata.swap("Sunday"));
    }
}
