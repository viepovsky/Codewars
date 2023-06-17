package printer_errors;

class Printer {
    static String printerError(String s) {
        return s.length() - s.replaceAll("[nopqrstuvwxyz]", "").length() + "/" + s.length();
    }
}
