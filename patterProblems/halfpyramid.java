package patterProblems;

public class halfpyramid {
    public static void main(String[] args) {
        halfpyramid(40);
    };

    public static void halfpyramid(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }

            System.out.println();
        }
    }
}
