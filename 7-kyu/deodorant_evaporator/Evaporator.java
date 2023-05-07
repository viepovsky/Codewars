package deodorant_evaporator;

public class Evaporator {
    public static int evaporator(double content, double evap_per_day, double threshold) {
        double life = 1;
        int days = 0;
        while (life > threshold / 100) {
            life *= (1 - evap_per_day / 100);
            days++;
        }
        return days;
    }
}
