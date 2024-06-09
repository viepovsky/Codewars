package the_office_4_find_a_meeting_room;

import java.util.Optional;
import java.util.stream.IntStream;

class Kata {
    static Object meeting(char[] x) {
        Optional<Object> result =
                IntStream.range(0, x.length)
                        .filter(i -> x[i] == 'O')
                        .mapToObj(i -> (Object) i)
                        .findFirst();
        return result.orElse("None available!");
    }
}
