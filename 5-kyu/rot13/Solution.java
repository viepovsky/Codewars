package rot13;

class Solution {
    static String rot13(String message) {
        char[] alphabetLowercase = "abcdefghijklmnopqrstuvwxyz".toCharArray();
        char[] alphabetUpperCase = "abcdefghijklmnopqrstuvwxyz".toUpperCase().toCharArray();
        char [] messageArray = message.toCharArray();
        for(int i = 0; i < messageArray.length; i++) {
            changeLetters(alphabetLowercase, messageArray, i);
            changeLetters(alphabetUpperCase, messageArray, i);
        }
        return String.valueOf(messageArray);
    }

    private static void changeLetters(char[] alphabet, char[] messageArray, int i) {
        for (int j = 0; j < alphabet.length; j++) {
            if (messageArray[i] == alphabet[j]) {
                if (j > 12) {
                    messageArray[i] = alphabet[j - 13];
                } else {
                    messageArray[i] = alphabet[j + 13];
                }
                break;
            }
        }
    }
}
