package recursion;

public class printIncDec {
    public static void printIncDec(int n) {
        // Base case
        if (n == 0) {
            return;
        }

        System.out.print(n + " ");
        printIncDec(n - 1);

        System.out.print(n + " ");

    }

    public static void main(String[] args) {
        int n = 5;
        printIncDec(5);
    }
}