package eliminate_the_intruders_bit_manipulation;

public class SetBits {
    public long eliminateUnsetBits(String number) {
        return number.contains("1") ? Long.parseLong(number.replaceAll("0",""), 2) : 0;
    }
}
