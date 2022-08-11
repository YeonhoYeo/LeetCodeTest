package Company.amazon.Recursion;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class LetterCombinationsofaPhoneNumber {

    static List<String> rtnVal = new ArrayList<>();
    ;
    static HashMap<Character, String> dial = new HashMap<>();
    static String phoneDigits;

    public static void main(String[] args) {

        dial.put('2', "abc");
        dial.put('3', "def");
        dial.put('4', "ghi");
        dial.put('5', "jkl");
        dial.put('6', "mno");
        dial.put('7', "pqrs");
        dial.put('8', "tuv");
        dial.put('9', "wxyz");

        String digits = "23";
        System.out.println(letterCombinations(digits));
    }

    public static List<String> letterCombinations(String digits) {
        if (digits.length() == 0) return rtnVal;
        phoneDigits = digits;
        backTrack(0, new StringBuilder());
        return rtnVal;
    }

    public static void backTrack(int index, StringBuilder path) {
        System.out.println("index = " + index);
        System.out.println("path = " + path);
        if (path.length() == phoneDigits.length()) {
            rtnVal.add(path.toString());
            return;
        }

        String letters = dial.get(phoneDigits.charAt(index));
        for (char letter : letters.toCharArray()) {
            path.append(letter);
            backTrack(index + 1, path);
            path.deleteCharAt(path.length() - 1);
        }

    }


}
