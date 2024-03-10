package find_the_slope;

class Kata {
    String slope(int[] points) {
        return points[2] - points[0] == 0 ? "undefined" : String.valueOf((points[3] - points[1]) / (points[2] - points[0]));
    }
}
