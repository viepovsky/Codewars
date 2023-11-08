package all_star_code_challenge;

class CodeWars {
    static int strCount(String str, char letter) {
        return (int) str.chars().filter(i -> i == letter).count();
    }
}
