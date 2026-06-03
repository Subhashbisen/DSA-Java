import java.util.*;

public class javaBasic {

    public static void main(String[] args) {
        int num = 165;
        isPalindrome(num);
    };

    public static void isPalindrome(int num) {
        int originalNum = num;
        int reversNum = 0;
        while (num > 0) {
            int lastNum = num % 10;
            reversNum = reversNum * 10 + lastNum;
            num = num / 10;
        }
        ;

        if (originalNum == reversNum) {
            System.out.println("The Number is palindrome");
        } else {
            System.out.println("The Number is Not Palindrome");
        }
    }
}