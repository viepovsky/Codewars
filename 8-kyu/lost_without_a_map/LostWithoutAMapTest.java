package lost_without_a_map;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class LostWithoutAMapTest {
    @Test
    void basicTests() {
        assertArrayEquals(new int[]{2, 4, 6}, LostWithoutAMap.map(new int[]{1, 2, 3}));
        assertArrayEquals(new int[]{8, 2, 2, 2, 8}, LostWithoutAMap.map(new int[]{4, 1, 1, 1, 4}));
        assertArrayEquals(new int[]{2, 2, 2, 2, 2, 2}, LostWithoutAMap.map(new int[]{1, 1, 1, 1, 1, 1}));
    }

    @Test
    void randomTests() {
        Random random = new Random();
        for (int i = 1; i <= 100; i++) {
            int[] randomArr = new int[i];
            for (int j = 0; j < randomArr.length; j++) {
                randomArr[j] = random.nextInt(1000);
            }
            int[] solution = Arrays.stream(randomArr).map(n -> n * 2).toArray();
            assertArrayEquals(solution, LostWithoutAMap.map(randomArr));
        }
    }
}
