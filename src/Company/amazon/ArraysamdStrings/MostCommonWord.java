package Company.amazon.ArraysamdStrings;

import java.util.HashMap;
import java.util.Map;

public class MostCommonWord {

    public static void main(String[] args) {

        String paragraph = "Bob hit a ball, the hit BALL flew far after it was hit.";
        String paragraph2 = "a, a, a, a, b,b,b,c, c";
        String[] banned = {"hit"};
        String[] banned2 = {"a"};
        System.out.println(mostCommonWord(paragraph2, banned2));
    }

    public static String mostCommonWord(String paragraph, String[] banned) {

        HashMap<String, Integer> map = new HashMap<>();
        paragraph = paragraph.toLowerCase();
        paragraph = paragraph.replaceAll(" ", ",");
        paragraph = paragraph.replaceAll("[^a-z,]", "");
        String[] attStr = paragraph.split(",");
        for (String s : attStr) {
            if ( s != "") map.put(s, map.getOrDefault(s, 0) + 1);
        }

        for (String s : banned) {
            if ( map.containsKey(s)) {
                map.put(s, 0);
            }
        }

        int valCnt = 0;
        String rtnVal = "";
        for (Map.Entry<String , Integer> enrty: map.entrySet()) {
            if ( valCnt < enrty.getValue()) {
                valCnt = enrty.getValue();
                rtnVal = enrty.getKey();
            }
        }

        System.out.println(map);

        return rtnVal;
    }
}
