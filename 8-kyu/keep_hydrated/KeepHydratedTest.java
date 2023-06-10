package keep_hydrated;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class KeepHydratedTest {
    KeepHydrated kh = new KeepHydrated();

    @Test
    void basicTest1() {assertEquals(1, kh.Liters(2));}
    @Test
    void basicTest2()  {assertEquals(0, kh.Liters(0.82));}
    @Test
    void basicTest3()  {assertEquals(6, kh.Liters(12.83));}
    @Test
    void basicTest4()  {assertEquals(901, kh.Liters(1802.44));}
    @Test
    void basicTest5()  {assertEquals(30, kh.Liters(60));}
    @Test
    void randTesting()  {

        for(int i = 0; i < 5; i++)  {

            double R = Math.random() * 100 + 1; // To 100
            assertEquals(((int)(R / 2)), kh.Liters(R));

            R = Math.random() * 10 + 1; // To 10
            assertEquals(((int)(R / 2)), kh.Liters(R));

        }

    }
}
