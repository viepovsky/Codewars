package string_merge;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KataTest {
    @Test
    void test1(){
        assertEquals("pere", Kata.stringMerge("person","here", 'e'));
    }
    @Test
    void test2(){
        assertEquals("apowiejouh", Kata.stringMerge("apowiejfoiajsf","iwahfeijouh", 'j'));
    }
    @Test
    void test3(){
        assertEquals("abcdefxxxyyyxyzz", Kata.stringMerge("abcdefxxxyzz","abcxxxyyyxyzz", 'x'));
    }
}
