package problems;

import java.util.*;

public class reverseStack {
    public static void pushAtBottom(Stack<Integer> s, int data) {
        // * Base Case
        if (s.isEmpty()) {
            s.push(data);
            return;
        }

        // * work
        int top = s.pop();
        pushAtBottom(s, data);
        s.push(top);
    }



    public static void reverseStack(Stack<Integer> s) {
        // * Base Case
        if (s.isEmpty()) {
            return;
        }

        // * work
        int top = s.pop();
        reverseStack(s);
        pushAtBottom(s, top);
    }

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        System.out.println(s);
        
        reverseStack(s);

        System.out.println(s);
    }
}

