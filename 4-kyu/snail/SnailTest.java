package snail;

import org.junit.jupiter.api.Test;

import java.util.Arrays;

import static java.util.stream.Collectors.joining;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class SnailTest {
    @Test
    void SnailTest1() {
        int[][] array
                = {{1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}};
        int[] r = {1, 2, 3, 6, 9, 8, 7, 4, 5};
        test(array, r);
    }

    @Test
    void SnailTest2() {
        int[][] array
                = {{1, 2, 3, 9},
                {4, 5, 6, 4},
                {7, 8, 9, 1},
                {1, 2, 3, 4}};
        int[] r = {1, 2, 3, 9, 4, 1, 4, 3, 2, 1, 7, 4, 5, 6, 9, 8};
        test(array, r);
    }

    @Test
    void SnailTest3() {
        int[][] array
                = {{1, 2, 3, 4, 5, 6},
                    {7, 6, 5, 4, 3, 7},
                    {8, 3, 4, 5, 2, 8},
                    {9, 2, 3, 3, 1, 9},
                    {8, 1, 7, 6, 2, 1},
                    {7, 6, 5, 4, 3, 2}};
        int[] r = {1, 2, 3, 4, 5, 6, 7, 8, 9, 1, 2, 3, 4, 5, 6, 7, 8, 9, 8, 7, 6, 5, 4, 3, 2, 1, 2, 6, 7, 1, 2, 3, 4, 5, 3, 3};
        test(array, r);
    }
    @Test
    void SnailTest4() {
        int[][] array
                = {{}};
        int[] r = {};
        test(array, r);
    }

    String int2dToString(int[][] a) {
        return Arrays.stream(a).map(Arrays::toString).collect(joining("\n"));
    }

    void test(int[][] array, int[] result) {
        String text = int2dToString(array) + " should be sorted to " + Arrays.toString(result);
        System.out.println(text);
        assertArrayEquals( result, Snail.snail(array));
    }
}
