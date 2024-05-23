package holiday_3_fire_on_the_boat;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {
    @Test
    void basicTest() {
        String case1 = "Boat Rudder Mast Boat Hull Water ~~ Boat Deck Hull ~~ Propeller Deck ~~ Deck Boat Mast";
        String case2 = "Mast Deck Engine Water ~~";
        String case3 = "~~ Deck Engine Sail Deck ~~ ~~ ~~ Rudder ~~ Boat ~~ ~~ Captain";
        assertEquals(case1, Kata.fireFight("Boat Rudder Mast Boat Hull Water Fire Boat Deck Hull Fire Propeller Deck Fire Deck Boat Mast"));
        assertEquals(case2, Kata.fireFight("Mast Deck Engine Water Fire"));
        assertEquals(case3, Kata.fireFight("Fire Deck Engine Sail Deck Fire Fire Fire Rudder Fire Boat Fire Fire Captain"));

    }
}
