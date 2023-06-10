package mexican_wave;

class MexicanWave {
    static String[] wave(String str) {
        String[] result = new String[str.replaceAll((" "), "").length()];
        StringBuilder tempString = new StringBuilder(str);
        int k = 0;
        for (int i = 0; i < str.length(); i++) {
            String c = String.valueOf(str.charAt(i));
            if (!c.equals(" ")) {
                result[k] = tempString.replace(i, i+1, c.toUpperCase()).toString();
                tempString = new StringBuilder(str);
            } else {
                k--;
            }
            k++;
        }
        return result;
    }
}
