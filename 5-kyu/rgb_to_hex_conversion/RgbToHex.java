package rgb_to_hex_conversion;

class RgbToHex {
    static String rgb(int r, int g, int b) {
        r = Math.max(Math.min(r, 255), 0);
        g = Math.max(Math.min(g, 255), 0);
        b = Math.max(Math.min(b, 255), 0);

        String rHex = Integer.toHexString(r).toUpperCase();
        String gHex = Integer.toHexString(g).toUpperCase();
        String bHex = Integer.toHexString(b).toUpperCase();

        if (rHex.length() == 1) rHex = "0" + rHex;
        if (gHex.length() == 1) gHex = "0" + gHex;
        if (bHex.length() == 1) bHex = "0" + bHex;

        return rHex + gHex + bHex;
    }
}
