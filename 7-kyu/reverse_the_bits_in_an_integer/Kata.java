package reverse_the_bits_in_an_integer;

class Kata {
    static int reverseBits(int n) {
        return Integer.parseInt(
                new StringBuilder(Integer.toBinaryString(n)).reverse().toString(), 2);
    }
}
