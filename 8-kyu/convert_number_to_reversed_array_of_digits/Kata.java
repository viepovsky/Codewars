package convert_number_to_reversed_array_of_digits;

class Kata {
    static int[] digitize(long n) {
        String number = String.valueOf(n);
        int[] result = new int[number.length()];
        for (int i = 0; i < number.length(); i++) {
            result[number.length() - 1 - i] = Character.getNumericValue(number.charAt(i));
        }
        return result;
    }
}
