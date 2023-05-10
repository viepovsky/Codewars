package is_your_period_late;

import java.time.LocalDate;

public class PeriodTime {
    public static boolean periodIsLate(LocalDate last, LocalDate today, int cycleLength) {
        return today.minusDays(cycleLength).isAfter(last);
    }
}
