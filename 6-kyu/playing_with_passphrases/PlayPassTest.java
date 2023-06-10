package playing_with_passphrases;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PlayPassTest {
    @Test
    void test1() {
        assertEquals("!!!vPz fWpM J", PlayPass.playPass("I LOVE YOU!!!", 1));
    }

    @Test
    void test4() {
        assertEquals("4897 NkTrC Hq fT67 GjV Pq aP OqTh gOcE CoPcTi aO",
                PlayPass.playPass("MY GRANMA CAME FROM NY ON THE 23RD OF APRIL 2015", 2));
    }

}
