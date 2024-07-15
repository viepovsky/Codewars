package sort_my_textbooks;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class KataTest {
    @Test
    void basicTest() {
        List<String> expected =
                new ArrayList<>(Arrays.asList("Algebra", "English", "Geometry", "History"));
        List<String> textbooks =
                new ArrayList<>(Arrays.asList("Algebra", "History", "Geometry", "English"));
        assertEquals(expected, Kata.sort(textbooks));
    }

    @Test
    void capitalizationTest() {
        List<String> expected =
                new ArrayList<>(Arrays.asList("Algebra", "english", "Geometry", "History"));
        List<String> textbooks =
                new ArrayList<>(Arrays.asList("Algebra", "History", "Geometry", "english"));
        assertEquals(expected, Kata.sort(textbooks));
    }

    @Test
    void symbolsTest() {
        List<String> expected =
                new ArrayList<>(Arrays.asList("$istory", "**English", "Alg#bra", "Geom^try"));
        List<String> textbooks =
                new ArrayList<>(Arrays.asList("Alg#bra", "$istory", "Geom^try", "**English"));
        assertEquals(expected, Kata.sort(textbooks));
    }
}
