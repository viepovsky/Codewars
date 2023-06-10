package disemvowel_trolls;

class Troll {
    static String disemvowel(String str) {
        return str.replaceAll("[aeiouAEIOU]", "");
    }
}
