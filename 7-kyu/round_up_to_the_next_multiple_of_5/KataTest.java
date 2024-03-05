package round_up_to_the_next_multiple_of_5;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {
    @Test
    void basicTests() {
        int[][] arr = {
//                {0, 0},
//                {1, 5},
//                {3, 5},
//                {5, 5},
//                {7, 10},
//                {39, 40},
                {-1, 0}
        };
        Arrays.stream(arr)
              .forEach(
                      (testCase) -> {
                          assertEquals(
                                  testCase[1],
                                  Kata.roundToNext5(testCase[0]));
                      });
    }
}
