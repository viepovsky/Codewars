package twice_as_old;

class TwiceAsOld {
    static int TwiceAsOld(int dadYears, int sonYears) {
        return dadYears >= sonYears * 2 ? dadYears - 2 * sonYears : 2 * sonYears - dadYears;
    }
}
