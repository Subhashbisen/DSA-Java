package patterProblems;

public class halfpyramidchar {
    public static void main(String[] args) {
        halfpyramidchar(4);
    };

    public static void halfpyramidchar(int n) {
        char ch = 'A';
        for (int line = 1; line <= n; line++) {
            for (int chars = 1; chars <= line; chars++) {
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}
