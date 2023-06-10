package bit_counting;

class Kata {
    static int countBits(int n){
        String binary = Integer.toBinaryString(n);
        return binary.length() - binary.replaceAll("1", "").length();
    }
}
