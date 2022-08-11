package others;

/**
 * There are N interns numbered from 1 to N. Each intern is assigned a unique ID for each day. Rules
 * being 1<=N<=24. The ith intern has an ID of (5000*i) on day 1 and for the rest of the days,
 * Day(i) = Day(i-1)+5000+(i-1) Input to the problem is ID of intern. Output is number of intern on
 * particular day. Here are the test cases for better understanding.
 *
 * <p>Test Case 1 Input: 15000 Output: Third intern ( Day 1 )
 *
 * <p>Test Case 2 Input: 25003 Output: Third intern ( Day 3 )
 */
public class CodePumkin2 {

    public static void main(String args[]) {
//        int internCnt = 3;
//        int day = 3;
        int input = 25003;
        int day = 1;

        check(input, day);


//    System.out.println(IDCal(24, 3));
    }

    static void check(int input, int day){
        for (int i = 1; i <= 24; i++) {
            while (true) {
                int rtnVal = IDCal(i, day);
                if ( input <= rtnVal) {
                    System.out.println("internCnt : " + i + ", day : " + day);
                    return;
                }
                day++;
            }
        }
    }

    static int IDCal(int internCnt, int day) {
        if (day == 1) {
            return 5000 * internCnt;
        } else {
            return IDCal(internCnt, day - 1) + 5000 + ( day -1 );
        }
    }

}
