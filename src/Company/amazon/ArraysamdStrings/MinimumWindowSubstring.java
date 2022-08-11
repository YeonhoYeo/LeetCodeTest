package Company.amazon.ArraysamdStrings;

import java.util.Arrays;
import java.util.HashMap;

public class MinimumWindowSubstring {
    public static void main(String[] args) {
        String s = "ADOBECODEBANC";
        String t = "ABC";
        System.out.println(minWindow(s, t));
    }

    public static String minWindow(String s, String t) {

        if (s.length() == 0 || t.length() == 0) {
            return "";
        }

        HashMap<Character, Integer> dictMap = new HashMap<>();
        for (char c : t.toCharArray()) {
            dictMap.put(c, dictMap.getOrDefault(c, 0) + 1);
        }

        int compartCnt = dictMap.size();
        int curCnt = 0;

        int left = 0;
        int right = 0;

        int size = -1;
        int rtnLeft = 0;
        int rtnRight = 0;

        HashMap<Character, Integer> curMap = new HashMap<>();
        while (right < s.length()) {
            char rc = s.charAt(right);
            curMap.put(rc, curMap.getOrDefault(rc, 0) + 1);
            if (curMap.get(rc).intValue() == dictMap.getOrDefault(rc, 0).intValue()) {
                curCnt++;
            }
            while (left <= right && compartCnt == curCnt) {
                if (size == -1 || size > right - left + 1) {
                    size = right - left + 1;
                    rtnLeft = left;
                    rtnRight = right;
                }
                char lc = s.charAt(left);
                curMap.put(lc, curMap.get(lc) - 1);
                if (curMap.get(lc).intValue() < dictMap.getOrDefault(lc, 0)) {
                    curCnt--;
                }
                left++;
            }
            right++;
        }
        return size == -1 ? "" : s.substring(rtnLeft, rtnRight + 1);
    }

}
