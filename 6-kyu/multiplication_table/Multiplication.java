package multiplication_table;

public class Multiplication {
    public static int [][] multiplicationTable(int n){
        int[][] result = new int[n][n];
        for (int i = 0; i < n; i++) {
            result[i][0] = i + 1;
            for (int j = 1; j < n; j++) {
                result[i][j] = result [i][0] * (j + 1);
            }
        }
        return result;
    }
}
