package does_my_number_look_big_in_this;

class NumberUtils {
    static boolean isNarcissistic(int number) {
        int sum = String.valueOf(number)
                    .chars()
                    .mapToObj(n -> (char) n)
                    .mapToInt(Character::getNumericValue)
                    .map(n -> n = (int) Math.pow(n, String.valueOf(number).length()))
                    .sum();
        return sum == number;
    }
}
