package greed_is_good;


public class Greed{
    public static int greedy(int[] dice){
        int resultPoints = 0;
        int[][] count = {{0,1000}, {0,200}, {0,300}, {0,400}, {0,500}, {0,600}};
        for (int die : dice) {
            count[die - 1][0]++;
        }
        for (int i = 0; i < count.length; i++) {
            if (count[i][0] >= 3 && i != 0 && i != 4) {
                resultPoints += count[i][1];
            }
            if (i == 0) {
                if (count[i][0] >= 3) {
                    resultPoints += count[i][1] + (count[i][0] - 3) * 100;
                } else {
                    resultPoints += count[i][0] * 100;
                }
            }
            if (i == 4) {
                if (count[i][0] >= 3) {
                    resultPoints += count[i][1] + (count[i][0] - 3) * 50;
                } else {
                    resultPoints += count[i][0] * 50;
                }
            }
        }
        return resultPoints;
    }
}
