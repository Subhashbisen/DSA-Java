public class validpalindromeTwo {

    public static boolean palindromehelper(int i, int j, String s) {
        while (i < j) {
            if (s.charAt(i) != s.charAt(j))
                return false;
            i++;
            j--;
        }

        return true;
    }

    public static boolean validpalindromeTwo(String s) {
        int i = 0;
        int j = s.length() - 1;

        while (i < j) {
            char left = s.charAt(i);
            char right = s.charAt(j);
            if (left == right) {
                i++;
                j--;
            } else {
                return palindromehelper(i + 1, j, s) || palindromehelper(i, j - 1, s);
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "abca";
        System.out.println(validpalindromeTwo(s));
    }
}
