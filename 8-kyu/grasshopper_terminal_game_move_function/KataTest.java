package grasshopper_terminal_game_move_function;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {
    @Test
    void basicTests() {
        assertEquals(8, Kata.move(0, 4));
        assertEquals(15, Kata.move(3, 6));
        assertEquals(12, Kata.move(2, 5));
    }
}
