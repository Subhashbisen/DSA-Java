
public class reverseArray {
    public static void reverse(int arr[]) {
        int start = 0;
        int end = arr.length - 1;

        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }
    }

    public static void main(String[] args) {
        int array[] = { 2, 4, 6, 8, 10 };
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }
};
