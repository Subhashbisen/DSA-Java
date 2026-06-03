import java.util.Scanner;

public class array {

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i] + 1;
        }
    }

    public static void main(String[] args) {
        int array[] = { 1, 2, 3, 4, 5 };
        printArray(array);
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
}
