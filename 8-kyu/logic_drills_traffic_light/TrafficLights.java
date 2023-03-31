package logic_drills_traffic_light;

public class TrafficLights {
    public static String updateLight(String current) {
        return switch (current) {
            case "green" -> "yellow";
            case "yellow" -> "red";
            default -> "green";
        };
    }
}
