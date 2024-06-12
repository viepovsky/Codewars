package surface_area_and_volume_of_a_box;

class Kata {
    static int[] getSize(int w, int h, int d) {
        return new int[]{(w*h*2 + w*d*2 + d*h*2), w*h*d};
    }
}
