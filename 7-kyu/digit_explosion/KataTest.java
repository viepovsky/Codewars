package digit_explosion;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {
    @Test
    void sampleTest() {
        String[][] testArray = new String[][]{
                {"312", "333122"},
                {"102269","12222666666999999999"},
                {"0", ""},
                {"000", ""},
                {"123", "122333"}};
        Arrays.stream(testArray).forEach(x ->
                assertEquals(x[1], Kata.explode(x[0]), "value " + x[0] + " is incorrect")
        );
    }
}
