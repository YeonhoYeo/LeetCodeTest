package Company.amazon.ArraysamdStrings;

/**
 * Two Pointer Approach
 *
 * Complexity Analysis
 *
 * Time complexity: O(n). Single pass.
 *
 * Space complexity: O(1). Constant space is used.
 */

public class ContainerWithMostWater {

    public static void main(String[] args) {

        int[] height = {1, 8, 6, 2, 5, 4, 8, 3, 7};
        int[] height2 = {1, 1};
        int[] height3 = {1, 3, 2, 5, 25, 24, 5};

        System.out.println(maxArea(height3));

    }

    public static int maxArea(int[] height) {

        int left = 0;
        int right = height.length - 1;
        int maxVal = 0;

        while (left < right) {
//            System.out.println("left + \" : \" + right = " + left + " : " + right);
//            System.out.println("Math.min(height[left], height[right]) = " + Math.min(height[left], height[right]));
//            System.out.println("right - left = " + (right - left));

            int size = Math.min(height[left], height[right]) * (right - left);
            maxVal = Math.max(maxVal, size);

            if (height[left] < height[right]) {
                left++;
            } else {
                right--;
            }
        }


        return maxVal;
    }

}
