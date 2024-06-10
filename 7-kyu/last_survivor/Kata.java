package last_survivor;


class Kata {
    static String lastSurvivor(String letters, int[] coords) {
        StringBuilder sb = new StringBuilder(letters);
        for (int i : coords) {
            sb.replace(i,i + 1,"");
        }
        return sb.toString();
    }
}
