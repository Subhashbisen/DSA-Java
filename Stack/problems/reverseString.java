package problems;

import java.util.*;

public class reverseString {
    public static String reverseString(String s) {
        Stack<Character> st = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            st.push(s.charAt(i));
        }

        StringBuilder str = new StringBuilder();

        for (int i = 0; i < s.length(); i++) {
            str.append(st.pop());
        }

        return str.toString();
    }

    public static void main(String[] args) {
        String s = "hello";
        System.out.println(reverseString(s));
    }
}
