
public class linearSearch {

    public static void linearSearch(int array[], int key) {
        // Linear Search
        for (int i = 0; i < array.length; i++) {
            if (array[i] == key) {
                System.out.println("Element found at index: " + i);
                return;
            }
        }

        System.out.println("Element not found in the array.");
    };

    public static void main(String args[]) {
         int array[] = {10,20,30,40,50};
         int key = 30;
         linearSearch(array, key);
    };
}
