package Company.amazon.SortingandSearching;

import java.util.Arrays;
import java.util.HashMap;

public class TwoSumII {

    public static void main(String[] args) {

        int[] numbers = {2,7,11,15};
        int target = 9;

        System.out.println(Arrays.toString(twoSum(numbers, target)));
    }

    public static int[] twoSum(int[] numbers, int target) {

        HashMap<Integer, Integer> map = new HashMap<>();
        for ( int i = 0; i < numbers.length; i++) {
            if (map.containsKey(target - numbers[i])) {
                return new int[] {map.get(target - numbers[i]) + 1, i + 1};
            } else {
                map.put(numbers[i], i);
            }
        }
        return null;
    }

}
