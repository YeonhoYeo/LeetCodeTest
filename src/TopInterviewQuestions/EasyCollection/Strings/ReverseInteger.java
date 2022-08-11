package TopInterviewQuestions.EasyCollection.Strings;

public class ReverseInteger {
    public static void main(String args[]) {
        int x = -123;
        System.out.println(reverse(x));
    }

    public static int reverse(int x) {
        int rtnVal = 0;
        while ( x !=0 ) {
            int r = x % 10;
            if (rtnVal > Integer.MAX_VALUE || rtnVal == Integer.MAX_VALUE / 10 && r > 7) return 0;
            if (rtnVal < Integer.MIN_VALUE || rtnVal == Integer.MIN_VALUE / 10 && r < -8) return 0;
            rtnVal = rtnVal * 10 + r;
            x = x / 10;
        }
        return rtnVal;
    }
}
