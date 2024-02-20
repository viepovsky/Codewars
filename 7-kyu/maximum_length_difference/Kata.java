package maximum_length_difference;

class Kata {
    static int mxdiflg(String[] a1, String[] b1) {
        if (a1.length == 0 || b1.length == 0) return -1;
        int minA = a1[0].length(), maxA = a1[0].length();
        for (String a : a1) {
            if (a.length() > maxA) maxA = a.length();
            if (a.length() < minA) minA = a.length();
        }

        int minB = b1[0].length(), maxB = b1[0].length();
        for (String b : b1) {
            if (b.length() > maxB) maxB = b.length();
            if (b.length() < minB) minB = b.length();
        }
        return Math.max(Math.abs(maxA - minB), Math.abs(maxB - minA));
    }
}
