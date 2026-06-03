package problems;

import java.util.*;

public class genrateParenthesis {

    public static void genrateParenthesis(int open, int close, int n,
            List<String> list, StringBuilder temp) {
        // Base Case
        if (open == n && close == n) {
            list.add(temp.toString());
            return;
        }

        // work
        if (open < n) {
            temp.append('(');
            genrateParenthesis(open + 1, close, n, list, temp);
            temp.deleteCharAt(temp.length() - 1);
        }

        if (close < open) {
            temp.append(')');
            genrateParenthesis(open, close + 1, n, list, temp);
            temp.deleteCharAt(temp.length() - 1);
        }

    }

    public static void main(String[] args) {
        int n = 3;
        List<String> list = new ArrayList<>();
        StringBuilder temp = new StringBuilder();
        genrateParenthesis(0, 0, n, list, temp);
        System.out.println(list);
    }
}
