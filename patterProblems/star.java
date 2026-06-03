
package patterProblems;

class star {
    public static void main(String[] args) {
        printStar(10);
    }

    public static void printStar(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}