package problems;

import java.util.ArrayList;
import java.util.List;

public class keypad {
    public static String[] mapping = {
            "",
            "",
            "abc",
            "def",
            "ghi",
            "jkl",
            "mno",
            "pqrs",
            "tuv",
            "wxyz",
    };

    public static void getCombo(String digits, List<String> list, StringBuilder temp, int index) {
        // *Base Case
        if (index == digits.length()) {
            list.add(temp.toString());
            return;
        }

        // *work
        String letters = mapping[digits.charAt(index) - '0'];

        for (int i = 0; i < letters.length(); i++) {
            char ch = letters.charAt(i);
            temp.append(ch);
            getCombo(digits, list, temp, index + 1);
            temp.deleteCharAt(temp.length() - 1); // backtracking
        }

    }

    public static void main(String[] args) {
        String digits = "23";
        List<String> list = new ArrayList<>();
        StringBuilder temp = new StringBuilder();
        getCombo(digits, list, temp, 0);
        System.out.println(list);
    }
}
