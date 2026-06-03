package patterns.twoPointer;

public class AppendSubseq {
    public static int AppendSubseq(String s, String t) {
        int i = 0;
        int j = 0;

        while (i < s.length() && j < t.length()) {
            if (s.charAt(i) == t.charAt(j)) {
                i++;
                j++;
            } else {
                i++;
            }
        }

        return t.length() - j;
    }

    public static void main(String[] args) {
        String s = "coaching";
        String t = "coding";

        String s1 = "coaching";
        String t1 = "coing";

        System.out.println(AppendSubseq(s, t));
        System.out.println(AppendSubseq(s1, t1));
    }
}
