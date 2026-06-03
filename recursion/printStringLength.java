package recursion;

public class printStringLength {

    public static int printLength(String str, int i) {

        if (i == str.length()) {
            return 0;
        }

        return 1 + printLength(str, i + 1);

    }

    public static void main(String[] args) {
        String str = "hello";
        System.out.println(printLength(str, 0));
    }
}
