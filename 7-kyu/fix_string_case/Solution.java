package fix_string_case;

class Solution {
    static String solve(final String str) {
        long lowercaseCount = str.chars()
                                .mapToObj(i -> (char)i)
                                .filter(Character::isLowerCase)
                                .count();
        return lowercaseCount >= str.length() - lowercaseCount ? str.toLowerCase() : str.toUpperCase();
    }
}
