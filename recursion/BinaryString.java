package recursion;

public class BinaryString {

    // public static void printBinary(int n, int lastpalce, String s) {
    // if (n == 0) {
    // System.out.println(s);
    // return;
    // }

    // if (lastpalce == 0) {
    // printBinary(n - 1, 0, s + "0");
    // printBinary(n - 1, 1, s + "1");
    // } else {
    // printBinary(n - 1, 0, s + "0");
    // }
    // }

    public static void printBinary(int n, int lastpalce, String s) {
        if (n == 0) {
            System.out.println(s);
            return;
        }

        if (lastpalce == 0) {
            printBinary(n - 1, 0, s + "0");
            printBinary(n - 1, 1, s + "1");
        } else {
            printBinary(n - 1, 0, s + "0");
        }
    }

    public static void main(String[] args) {
        printBinary(3, 0, "");
    }
}
