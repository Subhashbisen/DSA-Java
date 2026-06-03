package recursion;

public class printNumbersdecreasing {

    // public static void printInc(int n) {
    // if (n == 1) {
    // System.out.print(n + " ");
    // return;
    // }

    // System.out.print(n + " ");
    // printInc(n - 1);
    // }

    public static void printNum(int n) {
        // * Base Case
        if (n < 0) {
            return;
        }

        // * Work
        System.out.print(n + " ");

        printNum(n - 1);
    }

    public static void main(String[] args) {
        int n = 10;
        // printInc(n);
        printNum(n);
    }
}
