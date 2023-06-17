package shorter_path;

import java.util.Arrays;

class ShortestPath {
    static String[] directions(String[] goal) {
        int[] directions = new int[2];
        Arrays.stream(goal).forEach(n -> {
            switch (n) {
                case "N" -> directions[0]++;
                case "S" -> directions[0]--;
                case "E" -> directions[1]++;
                case "W" -> directions[1]--;
            }
        });
        int steps = Math.abs(directions[0]) + Math.abs(directions[1]);
        String[] result = new String[steps];
        for (int i = 0; i < Math.abs(directions[0]); i++) {
            result[i] = directions[0] > 0 ? "N" : "S";
        }
        for (int i = Math.abs(directions[0]);  i < steps; i++) {
            result[i] = directions[1] > 0 ? "E" : "W";
        }
        return result.length == 0 ? new String[]{""} : result;
    }
}
