package be_concise_iv_index_of_an_element_in_an_array;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionTest {

    @Test
    @DisplayName("should behave as expected")
    void testFind() {
        String[] array = {"2", "3", "5", "7", "11"};
        assertEquals("2", Solution.kata(array, "5"));
        assertEquals("4", Solution.kata(array, "11"));
    }

    @Test
    @DisplayName("Not found")
    void testNoutFound() {
        String[] array = {"2", "3", "5", "7", "11"};
        assertEquals(Solution.kata(array, "843646"), "Not found");
    }
}
