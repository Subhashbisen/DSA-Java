package problems;

import java.util.*;

public class genarateBinaryNumbers {
    public static ArrayList BinaryNumbers(int n) {
        ArrayList<String> result = new ArrayList<>();

        Queue<String> q = new LinkedList<>();

        q.add("1");

        for (int i = 0; i < n; i++) {
            String curr = q.remove();
            result.add(curr);
            q.add(curr + "0");
            q.add(curr + "1");
        }

        return result;
    }

    public static void main(String[] args) {
        int n = 4;
        System.out.println(BinaryNumbers(n));
    }
}
