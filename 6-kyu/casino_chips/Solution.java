package casino_chips;

import java.util.Arrays;

class Solution {
    static int solve(int [] arr){
        arr = Arrays.stream(arr).sorted().toArray();
        if (arr[0] + arr[1] <= arr[2]) return arr[0] + arr[1];

        boolean endLoop = false;
        int result = 0;
        while (!endLoop) {
            if (arr[0] > 0) {
                arr[0]--;
                arr[2]--;
                result++;
            } else if (arr[1] > 0) {
                arr[1]--;
                arr[2]--;
                result++;
            }
            arr = Arrays.stream(arr).sorted().toArray();
            if (arr[0] == 0 && arr[1] == 0) {
            endLoop = true;
            }
        }
        return result;
    }
}
