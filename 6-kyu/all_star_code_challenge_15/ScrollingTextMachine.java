package all_star_code_challenge_15;

class ScrollingTextMachine {
    String[] rotate(String text) {
        String[] result = new String[text.length()];
        for (int i = 0; i < text.length(); i++) {
            if (i == 0) {
                result[0] = text.substring(1) + text.charAt(0);
            } else {
                result[i] = result[i - 1].substring(1) + result[i - 1].charAt(0);
            }
        }
        return text.length() == 0 ? new String[0] : result;
    }
}


