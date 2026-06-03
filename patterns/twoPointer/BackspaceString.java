package twoPointer;

import java.util.*;

public class BackspaceString {
    public static boolean BackspaceString(String s, String t) {
        StringBuilder temp1 = new StringBuilder();
        StringBuilder temp2 = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) != '#') {
                temp1.append(s.charAt(i));
            } else {
                if (temp1.length() > 0) {
                    temp1.deleteCharAt(temp1.length() - 1);
                }
            }
        }

        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) != '#') {
                temp2.append(t.charAt(i));
            } else {
                if (temp2.length() > 0) {
                    temp2.deleteCharAt(temp2.length() - 1);
                }
            }
        }

        return temp1.toString().equals(temp2.toString());
    }

    public static void main(String[] args) {
        String s = "a#c", t = "b";
        System.out.println(BackspaceString(s, t));
    }
}