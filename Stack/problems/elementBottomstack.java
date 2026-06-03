package problems;

import java.util.*;

public class elementBottomstack {
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

    public static void main(String[] args) {
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);

        pushAtBottom(s, 0);

        System.out.println(s);
    }
}