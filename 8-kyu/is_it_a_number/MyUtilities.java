package is_it_a_number;

class MyUtilities {
    boolean isDigit(String s)
    {
        System.out.println(s);
        return s.matches("-?[0-9]+\\.?[0-9]*|-?[0-9]+");
    }
}
