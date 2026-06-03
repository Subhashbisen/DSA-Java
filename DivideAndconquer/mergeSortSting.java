package DivideAndconquer;

public class mergeSortSting {
    public static void printArray(String arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

        System.out.println();
    };

    public static void mergeSortSting(String arr[], int left, int right) {
        // * base case
        if (left >= right) {
            return;
        }

        int mid = left + (right - left) / 2;

        mergeSortSting(arr, left, mid);
        mergeSortSting(arr, mid + 1, right);

        merge(arr, left, mid, right);
    };

    public static void merge(String arr[], int left, int mid, int right) {
        String temp[] = new String[right - left + 1];

        int i = left;
        int j = mid + 1;
        int k = 0;

        while (i <= mid && j <= right) {
            if (arr[i].charAt(0) < arr[j].charAt(0)) {
                temp[k] = arr[i];
                i++;
            } else {
                temp[k] = arr[j];
                j++;
            }
            k++;
        }

        // * left part
        while (i <= mid) {
            temp[k] = arr[i];
            i++;
            k++;
        }

        // * right part
        while (j <= right) {
            temp[k] = arr[j];
            j++;
            k++;
        }

        int k2 = 0;
        int l = left;

        // * copy temp to original num array
        while (k2 < temp.length) {
            arr[l] = temp[k2];
            k2++;
            l++;
        }
    }

    public static void main(String[] args) {
        String arr[] = { "sun", "earth", "mars", "mercury" };
        mergeSortSting(arr, 0, arr.length - 1);
        printArray(arr);
    }
}
