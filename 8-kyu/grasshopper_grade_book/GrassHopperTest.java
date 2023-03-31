package grasshopper_grade_book;

import org.junit.jupiter.api.Test;

import java.util.Random;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GrassHopperTest {
    @Test
    public void test1() {
        assertEquals('A', GrassHopper.getGrade(95,90,93));
        assertEquals('A', GrassHopper.getGrade(100,85,96));
        assertEquals('A', GrassHopper.getGrade(92,93,94));
        assertEquals('A', GrassHopper.getGrade(100,100,100));
    }
    @Test
    public void test2() {
        assertEquals('B', GrassHopper.getGrade(70,70,100));
        assertEquals('B', GrassHopper.getGrade(82,85,87));
        assertEquals('B', GrassHopper.getGrade(84,79,85));
    }
    @Test
    public void test3() {
        assertEquals('C', GrassHopper.getGrade(70,70,70));
        assertEquals('C', GrassHopper.getGrade(75,70,79));
        assertEquals('C', GrassHopper.getGrade(60,82,76));
    }
    @Test
    public void test4() {
        assertEquals('D', GrassHopper.getGrade(65,70,59));
        assertEquals('D', GrassHopper.getGrade(66,62,68));
        assertEquals('D', GrassHopper.getGrade(58,62,70));
    }
    @Test
    public void test5() {
        assertEquals('F', GrassHopper.getGrade(44,55,52));
        assertEquals('F', GrassHopper.getGrade(48,55,52));
        assertEquals('F', GrassHopper.getGrade(58,59,60));
        assertEquals('F', GrassHopper.getGrade(0,0,0));
    }
    @Test
    public void test6() {
        Random rand = new Random();
        for (int i = 0; i < 50; ++i) {
            int[] a = {rand.nextInt(100), rand.nextInt(100), rand.nextInt(100)};
            assertEquals(getGrade(a[0], a[1], a[2]), GrassHopper.getGrade(a[0], a[1], a[2]));
        }
    }
    public char getGrade(int s1, int s2, int s3) {
        double score = (s1 + s2 + s3) / 3.0;
        if (score >= 90) return 'A';
        if (score >= 80) return 'B';
        if (score >= 70) return 'C';
        if (score >= 60) return 'D';
        return 'F';
    }
}
