import java.util.*;

public class TwoDarray {

    public static void main(String[] args) {
        // int matrix[][] = {
        // { 1, 2, 3 },
        // { 4, 5, 6 },
        // { 7, 8, 9 }
        // };

        // for (int i = 0; i < matrix.length; i++) {
        // for (int j = 0; j < matrix[i].length; j++) {
        // System.out.print(matrix[i][j] + " ");
        // }
        // System.out.println();
        // }

        Scanner sc = new Scanner(System.in);

        int matrix[][] = new int[3][3];

        System.out.println("Enter the values for matrix");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = sc.nextInt();
            }
        }
        ;

        System.out.println("print the values of matrix");

        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }

    }
}
