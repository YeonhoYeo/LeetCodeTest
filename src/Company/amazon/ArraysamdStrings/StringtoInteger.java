package Company.amazon.ArraysamdStrings;

/**
 * Follow the Rules
 *
 * Complexity Analysis
 *
 * If NN is the number of characters in the input string.
 *
 * Time complexity: O(N)
 *
 * We visit each character in the input at most once and for each character we spend a constant amount of time.
 *
 * Space complexity: O(1)
 *
 * We have used only constant space to store the sign and the result.
 */

public class StringtoInteger {
    public static void main(String[] args) {

        String s = "  -91283472332";
//        String s = "4193 with words";
//        String s = "words and 987";
        System.out.println(myAtoi("+-12"));
    }

    public static int myAtoi(String s) {
        int rtnVal = 0;
        int index = 0;
        int sign = 1;

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == ' ') {
                index++;
            } else {
                break;
            }
        }

        for (int i = index; i < s.length(); i++) {
            if (s.charAt(i) == '-') {
                sign = -1;
                index++;
            } else if (s.charAt(i) == '+') {
                index++;
            }
            break;
        }

        int minValue = Integer.MIN_VALUE;
        int maxValue = Integer.MAX_VALUE;

        System.out.println("minValue = " + minValue);
        System.out.println("maxValue = " + maxValue);

        for (int i = index; i < s.length(); i++) {
            if (Character.isDigit(s.charAt(i))) {
                int charVal = s.charAt(i) - '0';
                if (rtnVal > maxValue / 10 || (rtnVal == maxValue / 10 && charVal > maxValue % 10)) {
                    return sign == -1 ? minValue : maxValue;
                }
                rtnVal = rtnVal * 10 + charVal;
            } else {
                break;
            }
        }
        return  rtnVal * sign;
    }
}
