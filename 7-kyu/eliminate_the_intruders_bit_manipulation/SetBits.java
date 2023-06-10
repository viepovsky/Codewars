package eliminate_the_intruders_bit_manipulation;

class SetBits {
    long eliminateUnsetBits(String number) {
        return number.contains("1") ? Long.parseLong(number.replaceAll("0",""), 2) : 0;
    }
}
