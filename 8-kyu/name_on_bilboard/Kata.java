package name_on_bilboard;

class Kata {
    static int billboard(String name, int price) {
        return Math.multiplyExact(name.length(), price);
    }
}
