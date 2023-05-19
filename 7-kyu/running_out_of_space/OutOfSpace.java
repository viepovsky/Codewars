package running_out_of_space;

public class OutOfSpace {
    public static String[] spacey(String[] array) {
        String[] result = new String[array.length];
        result[0] = array[0];
        for (int i = 1; i < array.length; i++) {
            result[i] = result[i-1] + array[i];
        }
        return result;
    }
}
