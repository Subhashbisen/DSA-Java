package recursion;

public class addDigit {

    public static int addDigit(int num) {

        if (num < 10) {
            return num;
        }

        int sum = 0;
        // work
        while (num > 0) {
            sum += num % 10; // last digit add
            num /= 10; // last digit remove
        }

        return addDigit(sum);
    }

    public static void main(String[] args) {
        int num = 57;
        System.out.println(addDigit(num));
    }
}
