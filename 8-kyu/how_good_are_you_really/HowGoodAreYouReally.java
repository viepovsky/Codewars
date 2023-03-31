package how_good_are_you_really;


import java.util.Arrays;
public class HowGoodAreYouReally {

    //NEW APPROACH AFTER 4 MONTHS
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int sum = Arrays.stream(classPoints).sum() + yourPoints;
        return yourPoints > sum / (classPoints.length + 1);
    }

    //OLD APPROACH
    public static boolean betterThanAverageOld(int[] classPoints, int yourPoints) {
        int averagePoints = 0;
        for (int i = 0; i < classPoints.length; i++){
            averagePoints += classPoints[i];
        }
        averagePoints = (averagePoints + yourPoints) / (classPoints.length + 1);
        return averagePoints < yourPoints ? true : false;
    }
}
