package bouncing_balls;

class BouncingBall {
    static int bouncingBall(double h, double bounce, double window) {
        if (h <= 0 || bounce <= 0 || bounce >= 1 || window >= h) {
            return -1;
        }
        int timesSeen = 0;
        while (window < h) {
            h *= bounce;
            if (h > window) {
                timesSeen += 2;
            }
        }
        return ++timesSeen;
    }
}
