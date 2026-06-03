
import java.util.*;

public class array {
    // Method that modifies an array
    public static void doubleValues(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            arr[i] *= 2; // Doubling each element
        }
    }
    public static void main(String[] args) {
        int[] numbers = { 1, 2, 3, 4, 5 };

        System.out.println("Before modification:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }

        // Passing array to modify
        doubleValues(numbers);

        System.out.println("\nAfter modification:");
        for (int num : numbers) {
            System.out.print(num + " ");
        }
    }
}
