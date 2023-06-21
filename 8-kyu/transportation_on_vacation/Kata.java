package transportation_on_vacation;

class Kata {
    static int rentalCarCost(int d) {
        return d < 3 ? d * 40 : d < 7 ? d * 40 - 20 : d * 40 - 50;
    }
}
