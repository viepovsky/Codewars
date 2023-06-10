package if_you_cant_sleep_just_count_sheep;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

class SolutionCheck {
    static String countingSheep(int num) {
        StringBuilder result = new StringBuilder();
        for (int i = 1; i <= num; i++) {
            result.append(i + " sheep...");
        }
        return result.toString();
    }
}

class SolutionTest {
    @Test
    void setTests() {
        assertEquals("", Kata.countingSheep(0));
        assertEquals("1 sheep...", Kata.countingSheep(1));
        assertEquals("1 sheep...2 sheep...", Kata.countingSheep(2));
        assertEquals("1 sheep...2 sheep...3 sheep...", Kata.countingSheep(3));
    }

    @Test
    void randomTests() {
        Random rand = new Random();
        int randomNum = rand.nextInt(100) + 1;
        assertEquals(SolutionCheck.countingSheep(randomNum), Kata.countingSheep(randomNum));
    }
}
