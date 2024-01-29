package strong_number_special_numbers_series_2;

class Kata {
    static String isStrongNumber(int num) {
        return String.valueOf(num)
                            .chars()
                            .map(Character::getNumericValue)
                            .map(Kata::factorial)
                            .sum() == num ? "STRONG!!!!" : "Not Strong !!";
    }

    static int factorial(int value) {
        if (value <= 1) return 1;
        return value * factorial(value - 1);
    }
}
