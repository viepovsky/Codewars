package sort_the_gift_code;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {
    @Test
    void Tests1() throws Exception {
        GiftSorter gs = new GiftSorter();
        assertEquals("abcdef", gs.sortGiftCode("fedcba"), "sort fedcba");
    }

    @Test
    void Tests2() throws Exception {
        GiftSorter gs = new GiftSorter();
        assertEquals("abcdefghijklmnopqrstuvwxyz", gs.sortGiftCode("zyxwvutsrqponmlkjihgfedcba"), "reverse alphabet");
    }
}
