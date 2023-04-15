package create_phone_number;

public class Kata {
    public static String createPhoneNumber(int[] numbers) {
        StringBuilder result = new StringBuilder("(");
        for (int i = 0; i < numbers.length; i++) {
            if (i < 3) {
                result.append(numbers[i]);
            }
            if (i == 3) {
                result.append(") ");
                result.append(numbers[i]);

            }
            if (i > 3 && i < 6) {
                result.append(numbers[i]);
            }
            if (i == 6) {
                result.append("-");
                result.append(numbers[i]);
            }
            if (i > 6) {
                result.append(numbers[i]);
            }
        }
        return result.toString();
    }
}
