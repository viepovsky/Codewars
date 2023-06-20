package maximum_subarray_sum;

import java.util.ArrayList;
import java.util.List;

class Max {
    static int sequence(int[] arr) {
        List<Integer> reducedArray = new ArrayList<>();
        int negativeSum = 0, positiveSum = 0;
        for (int value : arr) {
            if (value >= 0) {
                if (negativeSum != 0) {
                    reducedArray.add(negativeSum);
                    negativeSum = 0;
                }
                positiveSum += value;
            } else {
                if (positiveSum != 0) {
                    reducedArray.add(positiveSum);
                    positiveSum = 0;
                }
                negativeSum += value;
            }
        }
        if (negativeSum != 0) {
            reducedArray.add(negativeSum);
        } else {
            reducedArray.add(positiveSum);
        }
        int max = 0;
        for (int i = 0; i < reducedArray.size(); i++) {
            if (reducedArray.get(i) > max) max = reducedArray.get(i);
            if (reducedArray.get(i) > 0) {
                int tempMax = reducedArray.get(i);
                for (int j = i + 1; j < reducedArray.size(); j++) {
                    tempMax += reducedArray.get(j);
                    if (tempMax > max) max = tempMax;
                }
            }
        }
        return max;
    }
}
