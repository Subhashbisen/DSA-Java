package problems;

import java.util.*;

public class keypadCombination {
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

    public static void getcombo(List<String> list, String digits, String temp, int index) {

        // Base case
        if (index == digits.length()) {
            list.add(temp);
            return;
        }

        // work
        String letters = mapping[digits.charAt(index) - '0'];

        for (int i = 0; i < letters.length(); i++) {
            char ch = letters.charAt(i);
            getcombo(list, digits, temp + ch, index + 1);
        }
        ;
    }

    public static void main(String[] args) {
        String digits = "23";
        List<String> list = new ArrayList<>();
        getcombo(list, digits, "", 0);
        System.out.println(list);
    }
}
