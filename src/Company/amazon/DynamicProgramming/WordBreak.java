package Company.amazon.DynamicProgramming;

import java.util.*;

public class WordBreak {

    public static void main(String[] args) {

        String s = "catsandog";
        String[] wordDictstr = {"cats", "dog", "sand", "and", "cat"};
        List<String> wordDict = Arrays.asList(wordDictstr);

        System.out.println(wordBreak(s, wordDict));
    }

    public static boolean wordBreak(String s, List<String> wordDict) {

        Set<String> dicSet = new HashSet(wordDict);
        System.out.println("s.length() = " + s.length());
        boolean[] check = new boolean[s.length() + 1];
        check[0] = true;

        for (int right = 1; right < s.length() + 1; right++) {
            for (int left = 0; left < right; left++) {
                if (check[left] && dicSet.contains(s.substring(left, right))) {
                    check[right] = true;
                    break;
                }
            }
            System.out.println(Arrays.toString(check));
        }

        return check[s.length()];
    }
}
