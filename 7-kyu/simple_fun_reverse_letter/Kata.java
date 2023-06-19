package simple_fun_reverse_letter;

class Kata {
    static String reverseLetter(final String str) {
        return new StringBuilder(str.replaceAll("[^a-zA-Z]", "")).reverse().toString();
    }
}
