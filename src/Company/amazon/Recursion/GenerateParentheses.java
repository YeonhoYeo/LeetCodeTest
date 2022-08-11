package Company.amazon.Recursion;

import java.util.ArrayList;
import java.util.List;

public class GenerateParentheses {

    public static void main(String[] args) {
        int n = 3;
        System.out.println(generateParenthesis(n));
    }

    public static List<String> generateParenthesis(int n) {
        List<String> rtnList = new ArrayList<>();
        bt(rtnList, new StringBuilder(),0, 0, n);
        return rtnList;
    }

    public static void bt(List<String> rtnList, StringBuilder cur, int open, int close, int n ){
        System.out.println("cur = " + cur);
        if (cur.length() == n * 2) {
            System.out.println("cur.toString() = " + cur.toString());
            rtnList.add(cur.toString());
            return;
        }
        if (open < n) {
            cur.append('(');
            bt(rtnList, cur,open + 1, close, n);
            cur.deleteCharAt(cur.length() - 1);
        }
        if (close < open) {
            cur.append(')');
            bt(rtnList, cur,open, close + 1, n);
            cur.deleteCharAt(cur.length() - 1);
        }
    }
}
