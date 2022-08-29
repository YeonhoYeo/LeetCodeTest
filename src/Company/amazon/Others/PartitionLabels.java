package Company.amazon.Others;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PartitionLabels {

    public static void main(String[] args) {
        String s = "ababcbacadefegdehijhklij";
        System.out.println(partitionLabels(s));
    }
    public static List<Integer> partitionLabels(String s) {
        int[] alphabet = new int[27];

        for (int i = 0; i < s.length(); i++) {
            alphabet[s.charAt(i) - 'a'] = i;
        }

        for (int a :  alphabet) {
            System.out.print(a + " ,");
        }
        System.out.println("------>");
        System.out.println(s.charAt(0) - 'a');

        List<Integer> rtnVal = new ArrayList<>();
        int div = 0;
        int ans = 0;
        for (int i = 0; i < s.length(); i++) {
            div = Math.max(div, alphabet[s.charAt(i) - 'a']);
            System.out.println("div = " + div);
            if (i == div) {
                rtnVal.add(i - ans + 1);
                ans = i + 1;
            }
        }

        return rtnVal;
    }

}
