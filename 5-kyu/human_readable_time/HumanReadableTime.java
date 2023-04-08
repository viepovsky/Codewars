package human_readable_time;

public class HumanReadableTime {
    public static String makeReadable(int seconds) {
        String h = String.format("%02d", seconds / 3600);
        String min = String.format("%02d", (seconds % 3600) / 60);
        String sec = String.format("%02d", seconds % 60);
        return  h + ":" + min + ":" + sec;
    }
}
