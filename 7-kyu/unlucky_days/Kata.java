package unlucky_days;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.util.stream.IntStream;

class Kata {
    static int unluckyDays(int year) {
        return (int) IntStream.rangeClosed(1, 12)
                              .mapToObj(i -> LocalDate.of(year, i, 13))
                              .filter(date -> date.getDayOfWeek()
                                                  .equals(DayOfWeek.FRIDAY))
                              .count();
    }
}
