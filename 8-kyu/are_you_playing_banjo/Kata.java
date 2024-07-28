package are_you_playing_banjo;

class Kata {
    static String areYouPlayingBanjo(String name) {
        return name.toLowerCase().startsWith("r") ? name + " plays banjo" : name + " does not play banjo";
    }
}
