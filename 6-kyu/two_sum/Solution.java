package two_sum;

public class Solution {
    public static int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        boolean resultFound = false;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = i + 1; j < numbers.length; j++) {
                if (numbers[i] + numbers[j] == target) {
                    result[0] = i;
                    result[1] = j;
                    resultFound = true;
                    break;
                }
            }
            if (resultFound) break;
        }
        return result;
    }
}
