package remove_the_time;

class Solution {
    static String shortenToDate(String longDate) {
        return longDate.substring(0, longDate.indexOf(","));
    }
}
