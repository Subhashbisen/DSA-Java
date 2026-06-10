package BinaryTree.problems;

public class BinaryTreeMaximumPathSum {
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

    static int maxSum = Integer.MIN_VALUE;

    public static int maxpathSum(Node root) {
        if (root == null) {
            return 0;
        }

        int left = maxpathSum(root.left);
        int right = maxpathSum(root.right);

        maxSum = Math.max(maxSum, root.val + left + right);

        return Math.max(0, Math.max(left, right) + root.val);
    }

    public static void main(String[] args) {
        Node root = new Node(-10);

        root.left = new Node(9);
        root.right = new Node(20);

        root.right.left = new Node(15);
        root.right.right = new Node(-25);

        root.right.left.left = new Node(7);
        root.right.left.right = new Node(-30);

        root.right.left.right.left = new Node(50);

        root.right.right.right = new Node(3);

        maxpathSum(root);

        System.out.println(maxSum);
    }
}
