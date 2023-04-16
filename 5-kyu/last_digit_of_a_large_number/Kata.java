package last_digit_of_a_large_number;

import java.math.BigInteger;

public class Kata {
    public static int lastDigit(BigInteger n1, BigInteger n2) {
        String aString = n1.toString();
        String bString = n2.toString();
        int aNumber = Character.getNumericValue(aString.charAt(aString.length() - 1));
        int bNumber = Character.getNumericValue(bString.charAt(bString.length() - 1));
        if (bString.length() == 1 && bNumber == 0) {
            return 1;
        }
        int restOf4Divide = n2.remainder(BigInteger.valueOf(4)).intValue();

        switch (aNumber) {
            case 0 : return 0;
            case 1 : return 1;
            case 2 : {
                switch (restOf4Divide) {
                    case 0  : return 6;
                    case 1 : return 2;
                    case 2 : return 4;
                    case 3 : return 8;
                }
            }
            case 3 : {
                switch (restOf4Divide) {
                    case 0  : return 1;
                    case 1 : return 3;
                    case 2 : return 9;
                    case 3 : return 7;
                }
            }
            case 4 : {
                if (bNumber % 2 == 0) {
                    return 6;
                } else {
                    return 4;
                }
            }
            case 5 : return 5;
            case 6 : return 6;
            case 7 : {
                switch (restOf4Divide) {
                    case 0  : return 1;
                    case 1 : return 7;
                    case 2 : return 9;
                    case 3 : return 3;
                }
            }
            case 8 : {
                switch (restOf4Divide) {
                    case 0  : return 6;
                    case 1 : return 8;
                    case 2 : return 4;
                    case 3 : return 2;
                }
            }
            default :  {
                if (bNumber % 2 == 0) {
                    return 1;
                } else {
                    return 9;
                }
            }
        }
    }
}
