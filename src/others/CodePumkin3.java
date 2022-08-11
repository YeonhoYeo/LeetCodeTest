package others;

/**
 There are N street lights numbered from 1 to N. Each street lamp i has two numbers start(i), end(i) meaning they can light all the streets numbered from start to end. You just need to find out how many areas are getting lighted.

 Test Case 1
 Input: {{5,8},{10,12}}
 Output: 5   i.e  (8-5) + (12-10)

 Test Case 2
 Input: {{5,10}, {8,12}}
 Output: 7   i.e  (10-5) + (12-8) – (10-8)(as it is Common)
 */
public class CodePumkin3 {

    public static void main(String args[]) {

        int[][] info1 = {{5, 8}, {10, 12}};
        int[][] info2 = {{5, 10}, {8, 12}};

    System.out.println(countLight(info2));


//    System.out.println(IDCal(24, 3));
    }

    static int countLight(int[][] info){
        int rtnVal = 0;
        for ( int i =0; i < info.length; i++) {
            rtnVal = rtnVal + info[i][1] - info[i][0];

            if ( i > 0 && info[i-1][1] > info[i][0]) {
                rtnVal = rtnVal - (info[i-1][1] - info[i][0]);
            }
        }


        return rtnVal;
    }

}
