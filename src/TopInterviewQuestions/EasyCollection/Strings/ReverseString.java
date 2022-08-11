package TopInterviewQuestions.EasyCollection.Strings;

import java.util.Arrays;

public class ReverseString {

    public static void main(String args[]) {
        char[] s = {'h', 'e', 'l', 'l', 'o', '1'};
        reverseString(s);
        System.out.println(Arrays.toString(s));
    }

    public static void reverseString(char[] s) {

        int i = 0;
        while (i < s.length / 2) {
            System.out.println("i = " + i);
            char temp = s[i];
            s[i] = s[s.length-1-i];
            s[s.length-1-i] = temp;
            i++;
        }

    }
}
