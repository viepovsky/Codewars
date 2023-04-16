package bit_counting;

public class Kata {
    public static int countBits(int n){
        String binary = Integer.toBinaryString(n);
        return binary.length() - binary.replaceAll("1", "").length();
    }
}
