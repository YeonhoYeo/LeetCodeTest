package Company.amazon.ArraysamdStrings;

import java.util.Stack;

public class ValidParentheses {

    public static void main(String[] args) {
        String s = "()[]{}";
        System.out.println(isValid(s));
    }

    public static boolean isValid(String s) {
        Stack<Character> stack = new Stack();
        for (char c : s.toCharArray()) {
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else {
                if (stack.size() == 0) return false;
                if ( stack.peek() == '(' && c == ')') {
                    stack.pop();
                } else if ( stack.peek() == '{' && c == '}') {
                    stack.pop();
                } else if ( stack.peek() == '[' && c == ']') {
                    stack.pop();
                } else {
                    return false;
                }
            }
        }
        return stack.size() == 0 ? true : false;
    }

}
