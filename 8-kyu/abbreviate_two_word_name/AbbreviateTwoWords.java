package abbreviate_two_word_name;

class AbbreviateTwoWords {
    static String abbrevName(String name) {
        return name.substring(0,1).toUpperCase() + "." + name.substring(name.indexOf(' ') + 1, name.indexOf(' ') + 2).toUpperCase();
    }
}
