package others;

public class Solution37 {

    public static void main(String[] args) {
        System.out.println(countAndSay(4));
    }

    public static String countAndSay(int n) {
        if (n == 1) return "1";

        String s = countAndSay(n - 1);
        System.out.println(s);
        StringBuilder ans = new StringBuilder();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {
            count++;
            if (i == s.length() - 1 || s.charAt(i) != s.charAt(i + 1)) {
                ans.append(count).append(s.charAt(i));
                count = 0;
            }

        }
        return ans.toString();
    }
}
