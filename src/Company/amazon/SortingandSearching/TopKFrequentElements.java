package Company.amazon.SortingandSearching;

import java.util.*;

public class TopKFrequentElements {

    public static void main(String[] args) {
        int[] nums = {1,1,1,2,2,3};
        int k = 2;
        System.out.println(Arrays.toString(topKFrequent(nums, k)));
    }

    public static int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int num : nums) {
            map.put(num, map.getOrDefault(num, 0) + 1);
        }

        PriorityQueue<int[]> integers = new PriorityQueue<>((o1, o2) -> o2[1] - o1[1]);
        for (Map.Entry<Integer, Integer> m : map.entrySet()) {
            integers.offer(new int[] {m.getKey(), m.getValue()});
        }

        System.out.println(map);
        System.out.println(integers.peek()[1]);

        int[] rtnVal = new int[k];
        for (int i = 0; i < k; i++) {
            rtnVal[i] = integers.poll()[0];
        }
        return rtnVal;

    }
}
