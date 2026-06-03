
// * leetcode quetion no 125. Valid Palindrome

public class validpalindrome {

    public static boolean isvalidpalindrome(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            char left = s.charAt(i);
            char right = s.charAt(j);

            if (!Character.isLetterOrDigit(left)) {
                i++;
                continue;
            }
            ;

            if (!Character.isLetterOrDigit(right)) {
                j--;
                continue;
            }

            if (Character.toLowerCase(left) != Character.toLowerCase(right)) {
                return false;
            }

            if (Character.toLowerCase(left) == Character.toLowerCase(right)) {
                i++;
                j--;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "A man, a plan, a canal: Panama";
        System.out.println(isvalidpalindrome(s));
    }
}