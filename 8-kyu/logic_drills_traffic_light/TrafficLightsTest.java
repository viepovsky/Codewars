package logic_drills_traffic_light;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TrafficLightsTest {
    String input;
    String expected;

    @Test
    public void testUpdateLight(){
        assertEquals("green", TrafficLights.updateLight("red"));
        assertEquals("yellow", TrafficLights.updateLight("green"));
        assertEquals("red", TrafficLights.updateLight("yellow"));
    }

    @Test
    public void testRandomUpdateLight() {
        Random rand = new Random();

        for (int i=0; i < 10; i++) {
            int index = rand.nextInt(3);
            switch (index) {
                case 0:
                    input = "green";
                    expected = "yellow";
                    break;
                case 1:
                    input = "yellow";
                    expected = "red";
                    break;
                case 2:
                    input = "red";
                    expected = "green";
                    break;
            }
            assertEquals(expected, TrafficLights.updateLight(input));
        }
    }
}
