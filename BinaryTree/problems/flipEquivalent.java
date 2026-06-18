// 951. Flip Equivalent Binary Trees lletcode
package BinaryTree.problems;

public class flipEquivalent {
    public static class Node {
        int val;
        Node left;
        Node right;

        Node(int val) {
            this.val = val;
            this.left = null;
            this.right = null;
        }
    }

    public static boolean flipEquiv(Node t1, Node t2) {

        if (t1 == null && t2 == null)
            return true;
        if (t1 == null || t2 == null)
            return false;
        if (t1.val != t2.val)
            return false;

        return (flipEquiv(t1.left, t2.left) && flipEquiv(t1.right, t2.right)) ||
                (flipEquiv(t1.left, t2.right) && flipEquiv(t1.right, t2.left));
    }

    public static void main(String[] args) {
        // -------- Tree 1 --------
        Node t1 = new Node(1);
        t1.left = new Node(2);
        t1.right = new Node(3);

        t1.left.left = new Node(4);
        t1.left.right = new Node(5);

        t1.left.right.left = new Node(7);
        t1.left.right.right = new Node(8);

        t1.right.right = new Node(6);

        // -------- Tree 2 --------
        Node t2 = new Node(1);
        t2.left = new Node(3);
        t2.right = new Node(2);

        t2.left.left = new Node(6);

        t2.right.left = new Node(4);
        t2.right.right = new Node(5);

        t2.right.right.left = new Node(8);
        t2.right.right.right = new Node(7);

        System.out.println(flipEquiv(t1, t2));
    }
}
