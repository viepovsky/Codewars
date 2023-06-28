package number_of_people_in_the_bus;

import java.util.ArrayList;

class Metro {
    static int countPassengers(ArrayList<int[]> stops) {
        return stops.stream()
                .mapToInt(i -> i[0] - i[1])
                .sum();
    }
}
