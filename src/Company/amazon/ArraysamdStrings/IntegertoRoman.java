package Company.amazon.ArraysamdStrings;
/**
 * Approach 1: Greedy
 *
 * Time complexity : O(1).
 *
 * As there is a finite set of roman numerals, there is a hard upper limit on how many times the loop can iterate. This upper limit is 15 times, and it occurs for the number 3888, which has a representation of MMMDCCCLXXXVIII. Therefore, we say the time complexity is constant, i.e. O(1)O(1).
 *
 * Space complexity : O(1).
 *
 * The amount of memory used does not change with the size of the input integer, and is therefore constant.
 *
 */

public class IntegertoRoman {

    public static void main(String[] args) {

        int num = 3999;
        System.out.println(intToRoman(num));

    }

    public static String intToRoman(int num) {
        int[] values = {1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1};
        String[] symbols = {"M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder sb = new StringBuilder();

        while (num > 0) {
            System.out.println("num = " + num);
            for (int i = 0; i < values.length; i++) {
                if (num - values[i] >= 0) {
                    num = num - values[i];
                    sb.append(symbols[i]);
                    break;
                }
            }
        }
        return String.valueOf(sb);
    }

}
