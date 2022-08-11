package Company.amazon.ArraysamdStrings;

public class IntegertoEnglishWords {

    public static void main(String[] args) {
        int num = 1000;
        int num2 = Integer.MAX_VALUE;
        System.out.println(numberToWords(num));
    }

    public static String numberToWords(int num) {
        if (num == 0) return "zero";
        String rtnVal = "";
        if (num / 1000000000 > 0) {
            rtnVal = underStr1000(num / 1000000000) + " Billion";
            num = num % 1000000000;
        }
        if (num / 1000000 > 0) {
            rtnVal = (rtnVal.length() == 0 ? "" : rtnVal + " ") + underStr1000(num / 1000000) + " Million";
            num = num % 1000000;
        }
        if (num / 1000 > 0) {
            rtnVal = (rtnVal.length() == 0 ? "" : rtnVal + " ") + underStr1000(num / 1000) + " Thousand";
            num = num % 1000;
        }
        String lastVal = underStr1000(num);
        System.out.println(rtnVal);
        System.out.println(rtnVal.length());
        if (rtnVal.length() > 0) {
            if (lastVal.length() > 0) {
                rtnVal = rtnVal + " " + lastVal;
            } else {
                rtnVal = rtnVal;
            }
        } else {
            rtnVal = lastVal;
        }
        return rtnVal;
    }

    public static String underStr1000(int i) {
        String rtnVal = "";
        if (i == 0) return "";
        if (i >= 100) {
            rtnVal = from1under9(i / 100) + " Hundred";
            i = i % 100;
        }
        if (10 <= i && i <= 19) {
            rtnVal = rtnVal.length() == 0 ? from10under19(i) : rtnVal + " " + from10under19(i);
        } else {
            if (i / 10 > 0) {
                rtnVal = rtnVal.length() == 0 ? from20under90(i / 10) : rtnVal + " " + from20under90(i / 10);
            }
            if (i % 10 > 0) {
                rtnVal = rtnVal.length() == 0 ? from1under9(i % 10) : rtnVal + " " + from1under9(i % 10);
            }
        }
        return rtnVal;
    }

    public static String from1under9(int i) {
        switch (i) {
            case 1:
                return "One";
            case 2:
                return "Two";
            case 3:
                return "Three";
            case 4:
                return "Four";
            case 5:
                return "Five";
            case 6:
                return "Six";
            case 7:
                return "Seven";
            case 8:
                return "Eight";
            case 9:
                return "Nine";
        }
        return "";
    }

    public static String from10under19(int i) {
        switch (i) {
            case 10:
                return "Ten";
            case 11:
                return "Eleven";
            case 12:
                return "Twelve";
            case 13:
                return "Thirteen";
            case 14:
                return "Fourteen";
            case 15:
                return "Fifteen";
            case 16:
                return "Sixteen";
            case 17:
                return "Seventeen";
            case 18:
                return "Eighteen";
            case 19:
                return "Nineteen";
        }
        return "";
    }

    public static String from20under90(int i) {
        switch (i) {
            case 2:
                return "Twenty";
            case 3:
                return "Thirty";
            case 4:
                return "Forty";
            case 5:
                return "Fifty";
            case 6:
                return "Sixty";
            case 7:
                return "Seventy";
            case 8:
                return "Eighty";
            case 9:
                return "Ninety";
        }
        return "";
    }
}
