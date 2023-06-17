package shorter_path;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class KataTest {
    @Test
    void Tests() {
        String[] goal1 = {"N","N","N","N","N","E","N","N"};
        assertArrayEquals(new String[] {"N","N","N","N","N","N","N","E"}, ShortestPath.directions(goal1));
        String[] goal2 = {"S","S","N","E","W","S","N"};
        assertArrayEquals(new String[] {"S"}, ShortestPath.directions(goal2));
        String[] goal3 = {"N","W","S","E"};
        assertArrayEquals(new String[]{""}, ShortestPath.directions(goal3));
    }
}
