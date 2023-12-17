package remove_first_and_last_character.java;

class RemoveChars {
    static String remove(String str) {
        return str.replaceAll("^.", "").replaceAll(".$","");
    }
}
