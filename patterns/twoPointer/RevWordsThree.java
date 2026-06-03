public class RevWordsThree {

    public static String reverseWord(String s) {

        StringBuilder sb = new StringBuilder(s);

        int start = 0;
        int end = 0;

        while (start < s.length()) {
            while (end < sb.length() && sb.charAt(end) != ' ') {
                end++;
            }

            int p1 = start;
            int p2 = end - 1;

            while (p1 < p2) {
                char temp = sb.charAt(p1);
                sb.setCharAt(p1, sb.charAt(p2));
                sb.setCharAt(p2, temp);
                p1++;
                p2--;
            }

            start = end + 1;
            end = start;
        }

        return sb.toString();

    }

    public static void main(String[] args) {
        String s = "Let's take LeetCode contest";
        System.out.println(reverseWord(s));
    }
}
