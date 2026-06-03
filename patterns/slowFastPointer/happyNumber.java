package patterns.slowFastPointer;

public class happyNumber {

    public static int getSumdigit(int n) {
        int sum = 0;
        while (n > 0) {
            int d = n % 10;
            sum += d * d;
            n /= 10;
        }
        return sum;
    }

    public static boolean ishappyNum(int n) {
        int slow = n;
        int fast = n;

        while (fast != 1) {
            slow = getSumdigit(n);
            fast = getSumdigit(n);
            fast = getSumdigit(n);

            if (slow == fast && slow != 1) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int n = 19;
        System.out.println(getSumdigit(n));
        System.out.println(ishappyNum(n));
    }
}
