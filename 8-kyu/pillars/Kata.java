package pillars;

public class Kata {
    public static int pillars(int numPill, int dist, int width){
        return numPill == 1 ? 0 : dist * (numPill - 1) * 100 + width * (numPill - 2);
    }
}
