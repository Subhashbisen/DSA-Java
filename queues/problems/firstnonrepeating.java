package queues.problems;

import java.util.*;

public class firstnonrepeating {

    public static String firstNonRepeating(String s) {
        int frequency[] = new int[26];
        StringBuilder result = new StringBuilder();
        Queue<Character> q = new LinkedList<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            q.add(ch);
            frequency[ch - 'a']++;

            while (!q.isEmpty() && frequency[q.peek() - 'a'] > 1) {
                q.remove();
            }

            if (q.isEmpty()) {
                result.append('#');
            } else {
                result.append(q.peek());
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        String s = "aabccxb";
        System.out.println(firstNonRepeating(s));
    }
}
