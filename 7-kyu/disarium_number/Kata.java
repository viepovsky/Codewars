package disarium_number;

class Kata {
    static String disariumNumber(int number) {
        char[] numbers = String.valueOf(number)
                               .toCharArray();
        double sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += Math.pow(Character.getNumericValue(numbers[i]), i + 1);
        }

        return sum == number ? "Disarium !!" : "Not !!";
    }
}
