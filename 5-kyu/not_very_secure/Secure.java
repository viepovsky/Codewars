package not_very_secure;

public class Secure {
    public static boolean alphanumeric(String s){
        return s.matches("[a-zA-Z0-9]+");
    }
}
