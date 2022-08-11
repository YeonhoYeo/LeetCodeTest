package Company.amazon.ArraysamdStrings;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class LongestSubstringWithoutRepeatingCharacters {

    public static void main(String[] args) {
        String s = "a";
        System.out.println(lengthOfLongestSubstring(s));
    }

    static public int lengthOfLongestSubstring(String s) {
        int maxVal = 0;

        for (int i = 0; i < s.length(); i++) {
            Set<Character> set = new HashSet<>();
            for (int j = i; j < s.length(); j++) {
                if (set.contains(s.charAt(j))) {
                    maxVal = Math.max(maxVal, j - i);
                    break;
                } else {
                    set.add(s.charAt(j));
                    maxVal = Math.max(maxVal, set.size());
                }
            }
        }

        return maxVal;
    }

}
