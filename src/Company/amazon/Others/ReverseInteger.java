package Company.amazon.Others;

public class ReverseInteger {

    public static void main(String[] args) {

        int x = -123;
        System.out.println(reverse(x));
    }

    public static int reverse(int x) {
        int rtnVal = 0;

        while ( x != 0) {
            int last = x % 10;
            x = x / 10;
            if (rtnVal > Integer.MAX_VALUE / 10 || rtnVal == Integer.MAX_VALUE / 10 && last >= Integer.MAX_VALUE % 10) {
                return 0;
            }
            if (rtnVal < Integer.MIN_VALUE / 10 || rtnVal == Integer.MIN_VALUE / 10 && last <= Integer.MIN_VALUE % 10) {
                return 0;
            }
            rtnVal = rtnVal * 10 + last;
        }
        return rtnVal;
    }
}
