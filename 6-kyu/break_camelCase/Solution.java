package break_camelCase;

public class Solution {
    public static String camelCase(String input) {
        StringBuilder result = new StringBuilder(input);
        int spaces = 0;
        for (int i = 0; i < input.length(); i++) {
            if (Character.isUpperCase(input.charAt(i))) {
                result.insert(i + spaces, " ");
                spaces++;
            }
        }
        return result.toString();
    }
}
