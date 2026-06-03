package recursion;

public class removeDupstring {
    public static void uniqueString(String s, StringBuilder sb, int i) {
        if (i > s.length() - 1) {
            System.out.println(sb);
            return;
        }

        char ch = s.charAt(i);

        boolean found = false;

        for (int j = 0; j < sb.length(); j++) {
            if (ch == sb.charAt(j)) {
                found = true;
                break;
            }
        }

        if (found != true) {
            sb.append(ch);
        }

        uniqueString(s, sb, i + 1);
    }

    public static void main(String[] args) {
        String s = "appnnacollege";
        StringBuilder sb = new StringBuilder();
        // sb.append(s.charAt(0));
        uniqueString(s, sb, 0);
    }
}