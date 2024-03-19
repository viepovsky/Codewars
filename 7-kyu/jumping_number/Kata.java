package jumping_number;

class Kata {
    static String jumpingNumber(int number)
    {
        String num = String.valueOf(number);
        for (int i = 1; i < num.length(); i++) {
            char current = num.charAt(i);
            char previous = num.charAt(i - 1);
            if (Math.abs(current - previous) != 1) return "Not!!";
        }
        return "Jumping!!";
    }
}
