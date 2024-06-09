package the_office_4_find_a_meeting_room;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {
    @Test
    void basic1() {
        assertEquals(1, Kata.meeting(new char[] {'X', 'O', 'X'}));
    }

    @Test
    void basic2() {
        assertEquals(0, Kata.meeting(new char[] {'O','X','X','X','X'}));
    }

    @Test
    void basic3() {
        assertEquals(2, Kata.meeting(new char[] {'X','X','O','X','X'}));
    }

    @Test
    void basic4() {
        assertEquals("None available!", Kata.meeting(new char[] {'X','X','X','X','X'}));
    }
}
