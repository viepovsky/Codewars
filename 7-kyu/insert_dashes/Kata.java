package insert_dashes;

class Kata {
    static String insertDash(int num) {
        String number = String.valueOf(num);
        StringBuilder result = new StringBuilder();
        for (int i = 1; i < number.length(); i++) {
            result.append(number.charAt(i - 1));
            if (number.charAt(i - 1) % 2 != 0 && number.charAt(i) % 2 != 0) {
                result.append('-');
            }
        }
        result.append(number.charAt(number.length() - 1));
        return result.toString();
    }
}
