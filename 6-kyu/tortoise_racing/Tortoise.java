package tortoise_racing;

class Tortoise {
    static int[] race(int v1, int v2, int g) {
        if (v1 >= v2) return null;
        int[] result = new int[3];
        v2 = v2 - v1;

        double speed = v2 / 3600.0;
        int totalTime = (int) (g / speed);
        int hour = totalTime / 3600;
        int min = (totalTime - hour * 3600) / 60;
        int sec = (totalTime - hour * 3600 - min * 60);

        result[0] = hour;
        result[1] = min;
        result[2] = sec;
        return result;
    }
}
