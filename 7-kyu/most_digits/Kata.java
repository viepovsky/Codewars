package most_digits;

class Kata {
    static int findLongest(int[] numbers) {
        int maxDigits = 0;
        int number = 0;
        for (int i : numbers) {
            int digitNumber = String.valueOf(i).replaceAll("-", "").length();
            if (digitNumber > maxDigits) {
                maxDigits = digitNumber;
                number = i;
            }
        }
        return number;
    }
}
