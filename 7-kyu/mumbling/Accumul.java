package mumbling;


class Accumul {
    static String accum(String s) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            result.append(Character.toUpperCase(s.charAt(i)));
            for (int j = 0; j < i; j++) {
                result.append(Character.toLowerCase(s.charAt(i)));
            }
            if (i != s.length() - 1) result.append("-");
        }
        return result.toString();
    }
}
