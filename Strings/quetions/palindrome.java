package Strings.quetions;

import java.util.*;

public class palindrome {

    public static boolean palindrome(String str) {
        int n = str.length() - 1;

        for (int i = 0; i < n / 2; i++) {
            if (str.charAt(i) != str.charAt(n - i)) {
                return false;
            }
        }

        return true;
    }

    public static void main(String[] args) {
        String str = "racecar";
        System.out.println(palindrome(str));
    }
}
