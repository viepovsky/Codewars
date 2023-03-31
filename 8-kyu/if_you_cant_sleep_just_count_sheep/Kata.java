package if_you_cant_sleep_just_count_sheep;

public class Kata {
    public static String countingSheep(int num) {
        String sheep = "";
        for (int i = 1; i < num + 1; i++){
            String tempSheep = i + " sheep...";
            sheep += tempSheep;
        }
        return sheep;
    }
}
