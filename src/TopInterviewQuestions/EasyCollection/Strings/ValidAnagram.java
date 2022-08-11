package TopInterviewQuestions.EasyCollection.Strings;

import java.util.HashMap;
import java.util.Map;

public class ValidAnagram {
    public static void main(String args[]) {
        String s = "anagram";
        String t = "nagaram";
        System.out.println(isAnagram(s, t));
    }

    public static boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        HashMap<Character, Integer> map = new HashMap<>();
        for (char c : t.toCharArray()) {
            map.put(c, map.getOrDefault(c, 0) + 1);
        }
        System.out.println(map);
        for (char c : s.toCharArray()) {
            if (map.containsKey(c)) {
                map.put(c, map.get(c) - 1);
            }
        }

        for (Map.Entry<Character, Integer> val: map.entrySet()){
            if (val.getValue() !=0) return false;
        }

        //if (map.values().stream().filter(integer -> integer > 0).count() == 0) return false;

        return true;
    }
}
