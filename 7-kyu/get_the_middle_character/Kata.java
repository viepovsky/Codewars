package get_the_middle_character;

public class Kata {
    public static String getMiddle(String word) {
        boolean odd = word.length() % 2 != 0;
        int middle = word.length() / 2;
        return odd ? Character.toString(word.charAt(middle)) : Character.toString(word.charAt(middle - 1)) + word.charAt(middle);
    }
}
