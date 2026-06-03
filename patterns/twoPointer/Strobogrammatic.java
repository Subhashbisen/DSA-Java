// * LeetCode 246: Strobogrammatic Number

package patterns.twoPointer;

public class Strobogrammatic {

    public static boolean checkStrobogrammatic(String s) {
        int left = 0;
        int right = s.length() - 1;

        while (left <= right) {
            char l = s.charAt(left);
            char r = s.charAt(right);

            if ((l == '0' && r == '0') || (l == '1' && r == '1') || (l == '8' && r == '8') || (l == '6' && r == '9')
                    || (l == '9' && r == '6')) {
                left++;
                right--;
            } else {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String s = "198861";
        System.out.println(checkStrobogrammatic(s));
    }
}
