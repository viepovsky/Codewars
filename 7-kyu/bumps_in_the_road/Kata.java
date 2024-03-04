package bumps_in_the_road;

class Kata {
    private static final String CAR_DEAD = "Car Dead";

    private static final String CAR_ALIVE = "Woohoo!";

    private static final char BUMP_CHAR = 'n';

    private static final int BUMPS_HEALTH = 15;

    static String bumps(final String road) {
        if (road.matches("_")) return CAR_DEAD;
        long bumps = road.chars()
                         .mapToObj(c -> (char) c)
                         .filter(c -> c.equals(BUMP_CHAR))
                         .count();
        return bumps <= BUMPS_HEALTH ? CAR_ALIVE : CAR_DEAD;
    }
}
