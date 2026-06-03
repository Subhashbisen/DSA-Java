package recursion;

public class sumofDigit {

    public static int sumofDigit(int n) {
        // Base Case
        if (n == 0) {
            return 0;
        }

        // work
        int lastNum = n % 10;
        int prevnums = n / 10;

        int ans = sumofDigit(prevnums);

        return ans + lastNum;
    }

    public static void main(String[] args) {
        int num = 567;
        System.out.println(sumofDigit(num));
    }
}
