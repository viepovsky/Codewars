package pick_peaks;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

class PickPeaks {
    static Map<String, List<Integer>> getPeaks(int[] arr) {
        List<Integer> pos = new ArrayList<>();
        List<Integer> peaks = new ArrayList<>();
        for (int i = 1; i < arr.length-1; i++) {
            if (arr[i] > arr[i - 1]){
                if (arr[i] > arr[i + 1]) {
                    pos.add(i);
                    peaks.add(arr[i]);
                } else if (arr[i] == arr[i + 1]) {
                    for (int j = i + 1; j < arr.length; j++) {
                        if (arr[i] > arr[j]) {
                            pos.add(i);
                            peaks.add(arr[i]);
                            break;
                        } else if (arr[i] < arr[j]) {
                            break;
                        }
                    }
                }
            }
        }
        Map<String, List<Integer>> result = new HashMap<>();
        result.put("pos", pos);
        result.put("peaks", peaks);
        return result;
    }
}
