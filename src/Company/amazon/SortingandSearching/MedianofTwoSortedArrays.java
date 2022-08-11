package Company.amazon.SortingandSearching;

import java.util.Arrays;

public class MedianofTwoSortedArrays {

    public static void main(String[] args) {
        int[] nums1 = {1, 3};
        int[] nums2 = {2, 4};
        System.out.println(findMedianSortedArrays(nums1, nums2));
    }

    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int[] sumNum = new int[nums1.length + nums2.length];
        int i = 0;
        for (int num1 : nums1 ) sumNum[i++] = num1;
        for (int num2 : nums2 ) sumNum[i++] = num2;
        Arrays.sort(sumNum);
        System.out.println(Arrays.toString(sumNum));
        if (sumNum.length % 2 == 0) {
            return (sumNum[sumNum.length / 2 - 1] + sumNum[sumNum.length / 2]) / (double)2;
        } else {
            return sumNum[sumNum.length / 2 ];
        }
    }
}
