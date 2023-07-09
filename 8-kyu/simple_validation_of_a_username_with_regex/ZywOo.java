package simple_validation_of_a_username_with_regex;

class ZywOo {
    static boolean validateUsr(String s) {
        return s.matches("[a-z0-9_]{4,16}");
    }
}
