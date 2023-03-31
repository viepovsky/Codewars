package sum_of_odd_numbers;

public class RowSumOddNumbers {
    public static int rowSumOddNumbers(int n) {
        int firstNumber = 0;
        for (int i = 0; i < n; i++) {
            firstNumber += i;
        }
        int lastNumber = firstNumber + n - 1;
        int result = 0;
        for (int i = firstNumber; i <= lastNumber; i++) {
            result += 2 * i + 1;
        }
        return result;
    }
}
