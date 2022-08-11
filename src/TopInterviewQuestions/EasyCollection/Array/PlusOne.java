package TopInterviewQuestions.EasyCollection.Array;

import java.util.Arrays;

public class PlusOne {
    public static void main(String[] args) {

        int[] nums = {1, 2, 3};
        int[] nums2 = {6, 1, 4, 5, 3, 9, 0, 1, 9, 5, 1, 8, 6, 7, 0, 5, 5, 4, 3};

        //System.out.println(Arrays.toString(plusOne(nums2)));

        System.out.println(Arrays.toString(test(nums)));

    }

    public static int[] plusOne(int[] digits) {

        for (int i = digits.length - 1; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i] = digits[i] + 1;
                return digits;
            }
        }

        digits = new int[digits.length + 1];
        digits[0] = 1;
        return digits;
    }

    public static int[] test(int[] digits) {
        digits = new int[digits.length + 1];
        return digits;
    }
}
