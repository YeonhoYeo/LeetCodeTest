package TopInterviewQuestions.EasyCollection.Strings;

public class ValidPalindrome {

    public static void main(String args[]){
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isPalindrome(s));
    }

    public static boolean isPalindrome(String s) {
        s = s.toLowerCase();
        s = s.replaceAll("[^a-z]]", "");
        System.out.println(s);
        return false;
    }
}
