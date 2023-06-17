package color_ghost;

import java.util.Random;

class Ghost {
    private final String color;
    Ghost() {
        Random random = new Random();
        int randColor = random.nextInt(4);
        switch (randColor) {
            case 0 -> color = "white";
            case 1 -> color = "yellow";
            case 2 -> color = "purple";
            default -> color = "red";
        };
    }
    String getColor() {
        return color;
    }
}
