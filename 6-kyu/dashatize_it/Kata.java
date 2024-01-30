package dashatize_it;

class Kata {
    static String dashatize(int num) {
        return String.valueOf(num)
                     .chars()
                     .filter(Character::isDigit)
                     .map(Character::getNumericValue)
                     .mapToObj(String::valueOf)
                     .reduce((a, b) -> {
                         if (Integer.parseInt(a.substring(a.length() - 1)) % 2 != 0 || Integer.parseInt(b.substring(b.length() - 1)) % 2 != 0)
                             return a + "-" + b;
                         return a + b;
                     })
                     .orElse("");
    }
}
