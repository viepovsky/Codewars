package snail;

import java.util.ArrayList;
import java.util.List;

public class Snail {
    public static int[] snail(int[][] array) {
        if (array.length == 0 || array[0].length == 0) {
            return new int[0];
        }
        List<Integer> resultArray = new ArrayList<>();
        int resultLength = array.length * array.length;
        boolean endLoop = false;
        int i = 0, j = 0;
        int loop = 1, newLoop = 0;

        while(!endLoop) {
            for (int k = j + newLoop; k <= array.length - loop; k++) {
                resultArray.add(array[i][k]);
                if (resultArray.size() == resultLength) {
                    endLoop = true;
                    break;
                }
                if (k == array.length - loop) {
                    j = k;
                }
            }
            if (endLoop) break;
            for (int k = i + 1; k <= array.length - loop; k++) {
                resultArray.add(array[k][j]);
                if (resultArray.size() == resultLength) {
                    endLoop = true;
                    break;
                }
                if (k == array.length - loop) {
                    i = k;
                }
            }
            if (endLoop) break;
            for (int k = j - 1; k >= loop - 1; k--) {
                resultArray.add(array[i][k]);
                if (resultArray.size() == resultLength) {
                    endLoop = true;
                    break;
                }
                if (k == loop - 1) {
                    j = k;
                }
            }
            if (endLoop) break;
            for (int k = i - 1; k > loop - 1; k--) {
                resultArray.add(array[k][j]);
                if (resultArray.size() == resultLength) {
                    endLoop = true;
                    break;
                }
                if (k == loop) {
                    i = k;
                }
            }
            loop++;
            if(newLoop == 0) {
                newLoop++;
            }
            System.out.println(resultArray);
        }
        System.out.println(resultArray);
        return resultArray.stream().mapToInt(Integer::intValue).toArray();
    }
}
