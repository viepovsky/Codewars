package how_good_are_you_really;


public class HowGoodAreYouReally {
    public static boolean betterThanAverage(int[] classPoints, int yourPoints) {
        int averagePoints = 0;
        for (int i = 0; i < classPoints.length; i++){
            averagePoints += classPoints[i];
        }
        averagePoints = (averagePoints + yourPoints) / (classPoints.length + 1);
        return averagePoints < yourPoints ? true : false;
    }
}
