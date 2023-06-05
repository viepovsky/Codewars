package total_amount_of_points;

import java.util.Arrays;

public class TotalPoints {
    public static int points(String[] games) {
        return Arrays.stream(games)
                .mapToInt(game -> {
                    int a = Character.getNumericValue(game.charAt(0));
                    int b = Character.getNumericValue(game.charAt(2));
            if (a > b) {
                return 3;
            } else if (a == b) {
                return 1;
            } else {
                return 0;
            }
        }).sum();
    }
}
