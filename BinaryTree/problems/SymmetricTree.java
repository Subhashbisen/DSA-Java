// 101. Symmetric Tree leetcode
package BinaryTree.problems;

public class SymmetricTree {
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

    public static boolean isMirror(Node left, Node right) {
        if (left == null && right == null) {
            return true;
        }

        if (left == null || right == null) {
            return false;
        }

        if (left.val != right.val) {
            return false;
        }

        return isMirror(left.left, right.right) && isMirror(left.right, right.left);
    }

    public static boolean isSymmetric(Node root) {
        if (root == null) {
            return true;
        }

        return isMirror(root.left, root.right);
    }

    public static void main(String[] args) {
        Node root = new Node(1);

        root.left = new Node(2);
        root.right = new Node(2);

        root.left.left = new Node(3);
        root.left.right = new Node(4);

        root.right.left = new Node(4);
        root.right.right = new Node(3);

        root.left.left.left = new Node(5);
        root.left.left.right = new Node(6);

        root.right.right.left = new Node(6);
        root.right.right.right = new Node(5);

        System.out.println(isSymmetric(root));
    }
}