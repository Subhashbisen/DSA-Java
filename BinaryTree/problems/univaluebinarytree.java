// 965. Univalued Binary Tree leetcode

package BinaryTree.problems;

public class univaluebinarytree {
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

    public static boolean isUnivalTree(Node root, int value) {
        if (root == null) {
            return true;
        }

        if (root.val != value) {
            return false;
        }

        if (isUnivalTree(root.left, value) && isUnivalTree(root.right, value)) {
            return true;
        }

        return false;

    }

    public static void main(String[] args) {
        Node root = new Node(1);

        root.left = new Node(1);
        root.right = new Node(1);

        root.left.left = new Node(1);
        root.left.right = new Node(1);

        root.right.right = new Node(1);

        int value = root.val;

        System.out.println(isUnivalTree(root, value));
    }
}
