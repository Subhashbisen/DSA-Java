package problems;

public class checkevenOdd {
    public static void evenOdd(int num) {
        if ((num & 1) == 0) {
            System.out.println("even number");
        } else {
            System.out.println("odd Number");
        }
    }

    public static void main(String[] args) {
        evenOdd(3);
        evenOdd(11);
        evenOdd(14);
    }
}
