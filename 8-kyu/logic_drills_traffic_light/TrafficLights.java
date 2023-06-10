package logic_drills_traffic_light;

class TrafficLights {
    static String updateLight(String current) {
        return switch (current) {
            case "green" -> "yellow";
            case "yellow" -> "red";
            default -> "green";
        };
    }
}
