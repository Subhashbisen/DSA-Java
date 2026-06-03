package recursion;

public class fibonacciNumber {

    // public static int fiboNumber(int n) {
    // // Base case
    // if (n == 1 || n == 0) {
    // return n;
    // }

    // // work & recursive call
    // int n1 = fiboNumber(n - 1);
    // int n2 = fiboNumber(n - 2);

    // // return
    // return n1 + n2;
    // }

    public static int fiboNumber(int n) {
        if (n == 1 || n == 0) {
            return n;
        }

        int n1 = fiboNumber(n - 1);
        int n2 = fiboNumber(n - 2);

        return n1 + n2;
    }

    public static void main(String[] args) {
        int n = 5;
        System.out.println(fiboNumber(n));
    }
}
