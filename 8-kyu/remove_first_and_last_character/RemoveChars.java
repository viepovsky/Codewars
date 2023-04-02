package remove_first_and_last_character;

public class RemoveChars {
    public static String remove(String str) {
        return str.replaceAll("^.", "").replaceAll(".$","");
    }
}
