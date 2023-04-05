package count_ip_addresses;

import java.util.List;

public class CountIPAddresses {
    public static long ipsBetween(String start, String end) {
        List<String> startInts = List.of(start.split("\\."));
        List<String> endInts = List.of(end.split("\\."));
        long result = 0L;
        for (int i = 3; i >= 0; i--) {
            int startIp = Integer.parseInt(startInts.get(i));
            int endIp = Integer.parseInt(endInts.get(i));
            int difference = endIp - startIp;
                switch (i) {
                    case 3 -> result += difference;
                    case 2 -> result += difference * 256L;
                    case 1 -> result += difference * 256L * 256L;
                    case 0 -> result += difference * 256L * 256L * 256L;
                }
        }
        return result;
    }
}
