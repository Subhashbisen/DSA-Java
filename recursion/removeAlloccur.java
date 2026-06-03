package recursion;

import Strings.string;

public class removeAlloccur {

    public static String removeOccur(StringBuilder s, int index, char target) {
        // Base Case
        if (index > s.length() - 1) {
            return s.toString();
        }

        // work
        if (s.charAt(index) == target) {
            s.deleteCharAt(index);
            removeOccur(s, index + 1, target);
        } else {
            removeOccur(s, index + 1, target);
        }

        return s.toString();
    }

    public static void main(String[] args) {
        StringBuilder s = new StringBuilder("banana");
        char target = 'a';
        System.out.println(removeOccur(s, 0, target));
    }
}
