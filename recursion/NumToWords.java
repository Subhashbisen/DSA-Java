package recursion;

public class NumToWords {

    public static void printDigits(int num, String digit[]) {
        // * Base Case
        if (num == 0) {
            return;
        }

        // * work
        int lastDigit = num % 10;

        printDigits(num / 10, digit);

        System.out.print(digit[lastDigit] + " ");
    }

    public static void main(String[] args) {
        int num = 2019;
        String digit[] = {
                "zero", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine"
        };
        printDigits(num, digit);
    }
}
