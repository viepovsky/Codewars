package regex_validate_pin_code;

class Solution {
    static boolean validatePin(String pin) {
        return pin.matches("^(\\d{4}|\\d{6})$");
        //this was my answer to avoid matching passwords like "lala1234" or "1234lala", but after completing kata I found that
        // matches from String returns true only if all String is match, so now I find redundant to use ^ and $
        // so the phrase can be simplified to "\\d{4}|\\d{6}"
    }
}
