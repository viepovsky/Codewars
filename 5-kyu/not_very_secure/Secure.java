package not_very_secure;

class Secure {
    static boolean alphanumeric(String s){
        return s.matches("[a-zA-Z0-9]+");
    }
}
