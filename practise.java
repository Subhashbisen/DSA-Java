import java.util.*;

public class practise {
    public static int largest(int arr[]) {
        int greater = Integer.MIN_VALUE;
        for (int i = 0; i <= arr.length; i++) {
            if (arr[i] > greater) {
                greater = arr[i];
            }
        }

        return greater;
    };

    public static void main(String[] args) {
        int array[] = { 10, 20, 30, 40, 50, 60, 70, 80 };
        System.out.println("largets no is"+ largest);
}
