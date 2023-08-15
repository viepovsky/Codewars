package the_wide_mouthed_frog;

class WideMouthedFrog {
    static String mouthSize(String animal){
        return animal.toLowerCase().matches("alligator") ? "small" : "wide";
    }
}
