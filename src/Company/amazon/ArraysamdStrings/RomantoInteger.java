package Company.amazon.ArraysamdStrings;

/**
 * Left-to-Right Pass Improved
 *
 * Time complexity : O(1)
 *
 * Same as Approach 1.
 *
 * Space complexity : O(1)
 *
 * Same as Approach 1.
 */

import java.util.Arrays;

public class RomantoInteger {

    public static void main(String[] args) {

        String s = "MCMXCIV";
        System.out.println(romanToInt(s));

    }

    public static int romanToInt(String s) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        int rtnVal = 0;

        for (int i = s.length(); i > 0; i--) {
            if ( i > 1 ) {
                int findStr = Arrays.asList(symbols).indexOf(s.substring(i-2, i));
                if ( findStr > -1) {
                    rtnVal = rtnVal + values[findStr];
                    i--;
                } else {
                    rtnVal = rtnVal + values[Arrays.asList(symbols).indexOf(s.substring(i-1, i))];
                }
            } else {
                rtnVal = rtnVal + values[Arrays.asList(symbols).indexOf(s.substring(i-1, i))];
            }
        }
        return rtnVal;

    }
}
