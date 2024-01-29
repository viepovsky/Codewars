package rotate_for_a_max;

class Kata {
    static long maxRot(long n) {
        long maxNumber = n;
        StringBuilder sb = new StringBuilder();
        sb.append(n);
        for (int i = 0; i < sb.length(); i++) {
            char digitToSwap = sb.charAt(i);
            sb.deleteCharAt(i);
            sb.append(digitToSwap);
            if (Long.parseLong(sb.toString()) > maxNumber) maxNumber = Long.parseLong(sb.toString());
        }
        return maxNumber;
    }
}
