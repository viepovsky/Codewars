package exes_and_ohs;

public class XO {
    public static boolean getXO (String str) {
        long x = str.toLowerCase().chars().mapToObj(c -> (char) c).filter(n -> n.equals('x')).count();
        long o = str.toLowerCase().chars().mapToObj(c -> (char) c).filter(n -> n.equals('o')).count();
        return x == o;
    }
}
