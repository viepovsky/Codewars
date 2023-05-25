package sum_of_digits;

public class DRoot {
    public static int digital_root(int n) {
        String input = String.valueOf(n);
        while (input.length() != 1) {
            int digitsSum = 0;
            for (int i = 0; i < input.length(); i++) {
                digitsSum += Character.getNumericValue(input.charAt(i));
            }
            input = String.valueOf(digitsSum);
        }
        return Integer.parseInt(input);
    }
}
