package remove_the_parentheses;

class Kata {
    static String removeParentheses(final String str) {
        String result = str;
        int length = 0;
        while (length != result.length()) {
            length = result.length();
            result = result.replaceAll("\\([^\\(\\)]*\\)", "");
        }
        return result;
    }
}
