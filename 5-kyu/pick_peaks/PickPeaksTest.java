package pick_peaks;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class PickPeaksTest {

    private static String[] msg = {"should support finding peaks",
            "should support finding peaks, but should ignore peaks on the edge of the array",
            "should support finding peaks; if the peak is a plateau, it should only return the position of the first element of the plateau",
            "should support finding peaks; if the peak is a plateau, it should only return the position of the first element of the plateau",
            "should support finding peaks, but should ignore peaks on the edge of the array"};

    private static int[][] array = {{1,2,3,6,4,1,2,3,2,1},
            {3,2,3,6,4,1,2,3,2,1,2,3},
            {3,2,3,6,4,1,2,3,2,1,2,2,2,1},
            {2,1,3,1,2,2,2,2,1},
            {2,1,3,1,2,2,2,2},
            {7,-4,12,12,15,10,14,14,11,-3,3,14,9,-3}};

    private static int[][] posS  = {{3,7},
            {3,7},
            {3,7,10},
            {2,4},
            {2},
            {4,6,11}};

    private static int[][] peaksS = {{6,3},
            {6,3},
            {6,3,2},
            {3,2},
            {3},
            {15,14,14}};

    @Test
    public void sampleTests() {
        for (int n = 0 ; n < msg.length ; n++) {
            final int[] p1 = posS[n], p2 = peaksS[n];
            Map<String,List<Integer>> expected = new HashMap<>() {{
                put("pos",   Arrays.stream(p1).boxed().collect(Collectors.toList()));
                put("peaks", Arrays.stream(p2).boxed().collect(Collectors.toList()));
            }},
                    actual = PickPeaks.getPeaks(array[n]);
            assertEquals(expected, actual);
        }
    }

    @Test
    public void testsMine() {
        assertEquals("{pos=[4, 6, 11], peaks=[15, 14, 14]}", PickPeaks.getPeaks(new int[] {7, -4, 12, 12, 15, 10, 14, 14, 11, -3, 3, 14, 9, -3}).toString());
    }
}
