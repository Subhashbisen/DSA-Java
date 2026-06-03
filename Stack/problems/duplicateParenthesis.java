package problems;

import java.util.*;

public class duplicateParenthesis {

    public static boolean isDuplicate(String str) {
        Stack<Character> s = new Stack<>();

        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);

            if (ch != ')') {
                s.push(ch);
            } else {
                int count = 0;
                while (s.peek() != '(') {
                    s.pop();
                    count++;
                }

                if (count < 1) {
                    return true; // duplicate
                } else {
                    s.pop(); // opening Pair
                }
            }
        }

        return false;
    }

    public static void main(String[] args) {
        String str = "((a+b))";
        String str2 = "(a-b)";
        System.out.println(isDuplicate(str2));
    }
}