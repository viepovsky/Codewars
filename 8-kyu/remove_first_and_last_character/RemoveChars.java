package remove_first_and_last_character;

class RemoveChars {
    static String remove(String str) {
        return str.replaceAll("^.", "").replaceAll(".$","");
    }
}
