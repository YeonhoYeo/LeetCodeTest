package Company.amazon.ArraysamdStrings;

import java.util.HashMap;

public class FirstUniqueCharacterinaString {

    public static void main(String[] args) {
        String s = "leetcode";
        System.out.println(firstUniqChar(s));
    }

    public static int firstUniqChar(String s) {

        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : s.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }

        int i = 0;
        for (char c : s.toCharArray()) {
            if ( map.get(c) == 1 ) return i;
            i++;
        }

        return -1;
    }


}
