package recursion;

public class subString {
    public static int printSubstring(String s, int start) {
        // Base case
        if (start == s.length()) {
            return 0;
        }

        int count = 0;
        // work
        for (int i = start; i < s.length(); i++) {
            System.out.print(s.substring(start, i + 1) + " ");
            if (s.charAt(start) == s.charAt(i)) {
                count++;
            }
        }
        System.out.println();

        // recursive call + accumalate
        return count + printSubstring(s, start + 1);
    }

    // public static void printSubstring(String s) {
    // for (int i = 0; i < s.length(); i++) {
    // for (int j = i; j < s.length(); j++) {
    // for (int k = i; k <= j; k++) {
    // System.out.print(s.charAt(k));
    // }
    // System.out.println();
    // }
    // }
    // }

    public static void main(String[] args) {
        String s = "abcab";
        System.out.println(printSubstring(s, 0));
        // printSubstring(s);

    }
}
