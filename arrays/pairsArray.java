
public class pairsArray {

    public static void pairArray(int number[]) {
        int start = 0;
        int end = number.length - 1;

        for (int i = start; i <= end; i++) {
            for (int j = i + 1; j <= end; j++) {
                System.out.print("(" + number[i] + "," + number[j] + ")");
            }
            System.out.println();
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int number[] = { 2, 4, 6, 8, 10 };
        pairArray(number);
    }
}
