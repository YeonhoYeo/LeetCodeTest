package Company.amazon.ArraysamdStrings;

import java.util.Arrays;
import java.util.Comparator;

public class ReorderLogFiles {

    public static void main(String[] args) {

        String[] logs = {"dig1 8 1 5 1"
                        ,"let1 art can"
                        ,"dig2 3 6"
                        ,"let2 own kit dig"
                        ,"let3 art zero"};
        // ["let1 art can"
        // ,"let3 art zero"
        // ,"let2 own kit dig"
        // ,"dig1 8 1 5 1"
        // ,"dig2 3 6"]


        String[] result = reorderLogFiles(logs);
        for (String s: result) {
            System.out.println(s);
        }
    }

    public static String[] reorderLogFiles(String[] logs) {

        Arrays.sort(logs, (o1, o2) -> {
            String[] s1 = o1.split(" ", 2);
            String[] s2 = o2.split(" ", 2);

            boolean b1Digt = Character.isDigit(s1[1].charAt(0));
            boolean b2Digt = Character.isDigit(s2[1].charAt(0));

            if ( !b1Digt && !b2Digt ) {
                int compatr = s1[1].compareTo(s2[1]);
                if (compatr == 0) {
                    return s1[0].compareTo(s2[0]);
                } else {
                    return compatr;
                }

            } else if ( b1Digt && !b2Digt ) {
                return 1;
            } else if ( !b1Digt && b2Digt ) {
                return -1;
            }
            return 0;
        });

        return logs;
    }

}
