package Company.amazon.ArraysamdStrings;

import java.util.*;

public class GroupAnagrams {

    public static void main(String[] args) {

        String[] strs = {"eat", "tea", "tan", "ate", "nat", "bat"};

        System.out.println(groupAnagrams(strs).toString());

    }

    public static List<List<String>> groupAnagrams(String[] strs) {

        List<List<String>> rtnList = new ArrayList<>();
        HashMap<String, Integer> map = new HashMap<>();

        for (int i = 0; i < strs.length; i++) {
            char[] temp = strs[i].toCharArray();
            Arrays.sort(temp);
            String tempStr = String.valueOf(temp);
//            System.out.println("tempStr = " + strs[i] + ":" + tempStr);

            if (map.containsKey(tempStr)) {
                List<String> tempList = rtnList.get(map.get(tempStr));
                tempList.add(strs[i]);
            } else {
                map.put(tempStr, rtnList.size());
                List<String> tempList = new ArrayList<>();
                tempList.add(strs[i]);
                rtnList.add(tempList);
            }
//            System.out.println("map.toString() = " + map.toString());

        }
        return rtnList;
    }
}
