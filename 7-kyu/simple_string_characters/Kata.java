package simple_string_characters;

class Kata {
    static int[] Solve(String word) {
        int[] result = new int[4];
        result[0] = word.length() - word.replaceAll("[A-Z]*", "").length();
        result[1] = word.length() - word.replaceAll("[a-z]*", "").length();
        result[2] = word.length() - word.replaceAll("[0-9]*", "").length();
        result[3] = word.length() - word.replaceAll("[!-\\/:-@\\[-`{-~]*", "").length();
        return result;
    }
}
