package others;

/**
 * Question 1) There are N bowls numbered from 1 to N and each bowl can contain maximum 9 marbles. A
 * user has to add a marble to the last bowl i.e. Nth Bowl. If Nth bowl is full i.e. it already has
 * 9 marbles, you need to check in (N-1)th bowl. If (N-1)th bowl has space to accomodate one more
 * marble, then you need to add marble in it and remove all the marbles from Nth bowl. You need to
 * identify the bowl will be modified when you add a marble. If all bowls are full, print output as
 * 0.
 *
 * <p>Input : First line contains number of bowls i.e. N Secons line will denotes number of marbles
 * in each bowl from 1 to N.
 *
 * <p>Output : index of last modified bowl.
 *
 * <p>Three Input Cases to understand the output better.
 *
 * <p>Test case 1 Input 2 2 3 Here first line denotes that there are 2 bowls. Second line denotes
 * that there are 2 marbles in first bowl and 3 marbles in second bowl. Output 2 First we will check
 * in the last bowl. It has less than 9 marbles, so we can add marble to last bowl and now status of
 * the bowls will be 2 4. As we have added marble to the second bowl, output will be 2.
 *
 * <p>Test Case 2 Input 2 2 9 Output 1 Since if we add 1 to the last bowl, it becomes 2 10, not
 * allowed, so the one marble gets carry forwarded to the next bowl making it 3 0, so 1st bowl is
 * the last modified.
 *
 * <p>Test Case 3 Input 2 9 9 Output 0 Since if we add 1 to the last bowl, it becomes 9 10, carry
 * forward it becomes 10 0, again a problem, so 0 0 Making nothing getting modified at the end.
 */
public class CodePumkin1 {
    public static void main(String args[]) {
        // 1 .. N bowls -> each bowls can have 9 marbles

        int[] bowlArr1 = {2, 3};
        int[] bowlArr2 = {2, 9};
        int[] bowlArr3 = {9, 9};
        int[] bowlArr4 = {1, 2, 3, 4, 5, 6, 7, 8, 9};

        System.out.println(test(bowlArr1));
        System.out.println(test(bowlArr2));
        System.out.println(test(bowlArr3));
        System.out.println(test(bowlArr4));
    }

    static int test(int[] input) {
        int rtnCnt = input.length;
        for (int i = input.length - 1; i >= 0; i--) {
            if (input[i] == 9) {
              rtnCnt--;
            }
        }
        return rtnCnt;
    }
}
