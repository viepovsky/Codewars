package alternate_capitalization;

class Solution {
    static String[] capitalize(String s){
        StringBuilder sb1 = new StringBuilder(), sb2 = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char character = s.charAt(i);
            if (i % 2 == 0) {
                sb1.append(Character.toUpperCase(character));
                sb2.append(character);
            } else {
                sb1.append(character);
                sb2.append(Character.toUpperCase(character));
            }
        }
        return new String[]{sb1.toString(), sb2.toString()};
    }
}
