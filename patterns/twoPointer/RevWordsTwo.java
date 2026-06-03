public class RevWordsTwo {

    public static void RevWords(char s[]) {
        int i = 0;
        int j = s.length - 1;

        while (i < j) {
            char temp = s[i];
            s[i] = s[j];
            s[j] = temp;

            i++;
            j--;
        }

        int start = 0;
        int end = 0;

        while (start < s.length) {
            while (end < s.length && s[end] != ' ') {
                end++;
            }

            int p1 = start;
            int p2 = end - 1;

            while (p1 < p2) {
                char temp = s[p1];
                s[p1] = s[p2];
                s[p2] = temp;

                p1++;
                p2--;
            }

            start = end + 1;
            end = start;
        }
    }

    public static void main(String[] args) {
        char s[] = { 't', 'h', 'e', ' ', 's', 'k', 'y', ' ', 'i', 's', ' ', 'b', 'l', 'u', 'e' };
        RevWords(s);
        for (int i = 0; i < s.length; i++) {
            System.out.print(s[i]);
        }
    }
}
