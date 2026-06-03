

public class example {

    public static void changeArr(int arr[], int i, int val) {
        // base case
        if (i == arr.length) {
            printArray(arr);
            return;
        }

        // work
        arr[i] = val;

        // Recursive Call
        changeArr(arr, i + 1, val + 1);

        // backtraking
        arr[i] = arr[i] - 2;

    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        int arr[] = new int[5];
        changeArr(arr, 0, 1);
        printArray(arr);
    }
}
