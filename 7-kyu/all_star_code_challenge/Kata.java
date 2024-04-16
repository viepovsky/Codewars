package all_star_code_challenge;

class Kata {
    static String toTime(int seconds){
        return String.format("%d hour(s) and %d minute(s)", seconds / 3600, seconds % 3600 / 60);
    }
}
