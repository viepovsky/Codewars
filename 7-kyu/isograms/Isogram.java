package isograms;

class Isogram {
    static boolean isIsogram(String str) {
        return str.length() == str.toLowerCase().chars().mapToObj(n -> (char) n).distinct().count();
    }
}
