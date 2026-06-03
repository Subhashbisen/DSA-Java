import java.util.*;

public class javaBasic {
    public static int toDecimal(int num) {
        System.out.println("Binary Number is " + num);
        int pow = 0;
        int decimal = 0;

        while (num > 0) {
            int lastDigit = num % 10;
            int ans = lastDigit * (int) Math.pow(2, pow);
            decimal += ans;
            num = num / 10;
            pow++;
        }
        return decimal;
    };


    public static void toBinary(int num ) {
      String rem = "";
      String binary = "";

      while(num > 0) {
        int quotient = num / 2;
        int remainder = num % 2;

        rem = remainder + rem;
        System.out.println("Remainder is " + rem);
        num = quotient;
      }
      
    //   for(int i = rem.length() - 1; i >= 0; i--) {
    //     binary = binary + rem.charAt(i);
    //   }

      System.out.println("Remainder is " + rem);
        //  System.out.println("Binary is " + binary);
    }


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a decimal Number");
        int n = sc.nextInt();
        toBinary(n);
    };
}