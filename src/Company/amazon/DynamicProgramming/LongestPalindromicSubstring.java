package Company.amazon.DynamicProgramming;

public class LongestPalindromicSubstring {

    public static void main(String[] args) {

        String s = "babad";
        System.out.println(longestPalindrome(s));
    }

    public static String longestPalindrome(String s) {
        int start = 0;
        int end = 0;
        for (int i = 0; i < s.length(); i++) {
            int maxVal = Math.max(search(s, i, i), search(s, i, i + 1));
            if (maxVal > end - start) {
                start = i - (maxVal -1) / 2;
                end = i + maxVal / 2;
            }
        }
        return s.substring(start, end+1);
    }

    public static int search(String s, int left, int right) {
        while (0 <= left && right < s.length() && s.charAt(left) == s.charAt(right)) {
            left--;
            right++;
        }
        return right - left - 1;
    }
}
