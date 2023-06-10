package beginner_series_1_school_paperwork;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class PaperTests {
    @Test
    void test1(){
        assertEquals(25, Paper.paperWork(5,5));
    }

    @Test
    void test2(){
        assertEquals(0, Paper.paperWork(5,-5));
    }

    @Test
    void test3(){
        assertEquals(0, Paper.paperWork(-5,-5));
    }

    @Test
    void test4(){
        assertEquals(0, Paper.paperWork(-5,5));
    }

    @Test
    void test5(){
        assertEquals(0, Paper.paperWork(5,0));
    }
}
