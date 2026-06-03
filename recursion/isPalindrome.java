package recursion;

public class isPalindrome {

    public static boolean isPalindrome(String s, int first, int last) {
        // Base Case
        if (first >= last) {
            return true;
        }

        // work
        if (s.charAt(first) != s.charAt(last)) {
            return false;
        }

        return isPalindrome(s, first + 1, last - 1);
    }

    public static void main(String[] args) {
        String s = "madam";
        System.out.println(isPalindrome(s, 0, s.length() - 1));
    }
}
