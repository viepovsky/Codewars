package tinder_for_programmers;

class ProgrammersMacher {
    static void rateProfile(Profile profile, Action swipeLeft, Action swipeRight) {
        if (profile.getBio().toLowerCase().contains("java")) {
            swipeRight.execute();
        } else {
            swipeLeft.execute();
        }
    }
}
