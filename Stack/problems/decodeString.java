package Stack.problems;

import java.util.*;

public class decodeString {
    public static String decodeString(String s) {
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            if (ch != ']') {
                stack.push(ch);
            } else {
                StringBuilder temp = new StringBuilder();

                while (stack.peek() != '[') {
                    // temp.insert(0, stack.pop());
                    temp.append(stack.pop());
                }

                temp.reverse();
                stack.pop(); // remove [

                StringBuilder numstr = new StringBuilder();
                while (!stack.isEmpty() && Character.isDigit(stack.peek())) {
                    // numstr.insert(0, stack.pop());
                    numstr.append(stack.pop());
                }

                numstr.reverse();

                int num = Integer.parseInt(numstr.toString());

                StringBuilder str = new StringBuilder();
                for (int j = 0; j < num; j++) {
                    str.append(temp);
                }

                for (int j = 0; j < str.length(); j++) {
                    stack.push(str.charAt(j));
                }
            }
        }

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            // result.insert(0, stack.pop());
            result.append(stack.pop());
        }

        // return result.toString();

        return result.reverse().toString(); // 🔥 single reverse

    }

    public static void main(String[] args) {
        String str = "3[a2[c]]";
        System.out.println(decodeString(str));
    }
}
