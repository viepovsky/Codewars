package take_a_ten_minutes_walk;

import java.util.Arrays;

public class TenMinWalk {
    public static boolean isValid(char[] walk) {
        int[][] coordinates = {{0, 0}};
        boolean validLength = false;
        if (walk.length == 10){
            for (int i = 0; i < 10; i++) {
                switch (walk[i]) {
                    case 'n' -> coordinates[0][0] += 1;
                    case 's' -> coordinates[0][0] -= 1;
                    case 'w' -> coordinates[0][1] += 1;
                    case 'e' -> coordinates[0][1] -= 1;
                }
            }
            validLength = true;
        }
        return validLength && Arrays.deepEquals(coordinates, new int[][]{{0, 0}});
    }
}
