package are_you_playing_banjo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {
    @Test
    void PeopleThatPlayBanjo() {
        assertEquals( "Martin does not play banjo", Kata.areYouPlayingBanjo("Martin"));
        assertEquals( "Rikke plays banjo", Kata.areYouPlayingBanjo("Rikke"));
        assertEquals( "rolf plays banjo", Kata.areYouPlayingBanjo("rolf"));
        assertEquals( "bravo does not play banjo", Kata.areYouPlayingBanjo("bravo"));
    }
}
