package tinder_for_programmers;

public class ProgrammersMacher {
    public static void rateProfile(Profile profile, Action swipeLeft, Action swipeRight) {
        if (profile.getBio().toLowerCase().contains("java")) {
            swipeRight.execute();
        } else {
            swipeLeft.execute();
        }
    }
}
