// * leetcode quetion no 344. reverse String

public class reversString {

    public static void reversString(char s[]) {
        int first = 0;
        int last = s.length - 1;

        while (first < last) {
            char temp = s[first];
            s[first] = s[last];
            s[last] = temp;
            first++;
            last--;
        }

        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i]);
        }
    }

    public static void main(String[] args) {
        char s[] = { 'h', 'e', 'l', 'l', 'o' };
        reversString(s);
    }
}
