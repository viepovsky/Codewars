package filter_the_number;

class Kata {
    static long filterString(final String value) {
        return Long.parseLong(value.replaceAll("[A-Z,a-z]",""));
    }
}
