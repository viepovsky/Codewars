package write_number_in_expanded_form;

public class Kata {
    public static String expandedForm(int num) {
        String numString = String.valueOf(num);
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < numString.length(); i++) {
            if (numString.charAt(i) != '0') {
                result.append(numString.charAt(i));
                for (int j = i; j < numString.length() - 1; j++) {
                    result.append("0");
                }
                if (i < numString.length() - 1){
                    result.append(" + ");
                }
            }
        }
        return result.toString().replaceFirst("\s\\+\s$","");
    }
}
