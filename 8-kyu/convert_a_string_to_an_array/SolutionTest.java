package convert_a_string_to_an_array;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SolutionTest {
    @Test
    void basicTests() {
        assertArrayEquals(new String[]{"Robin", "Singh"}, Solution.stringToArray("Robin Singh"));
        assertArrayEquals(new String[]{"I", "love", "arrays", "they", "are", "my", "favorite"}, Solution.stringToArray("I love arrays they are my favorite"));
    }
}
