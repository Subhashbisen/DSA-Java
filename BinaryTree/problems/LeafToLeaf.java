// Max Path Sum 2 Special Nodes gfg
package BinaryTree.problems;

public class LeafToLeaf {
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

        if (root.left == null && root.right == null) {
            return root.val;
        }

        int left = maxpathSum(root.left);
        int right = maxpathSum(root.right);

        if (root.left != null && root.right != null) {
            maxSum = Math.max(maxSum, left + right + root.val);

            return Math.max(left, right) + root.val;
        }

        if (root.left != null) {
            return right + root.val;
        }

        // Sirf right child
        return right + root.val;
    }

    public static void main(String[] args) {
        Node root = new Node(10);

        root.left = new Node(2);
        root.right = new Node(3);

        root.left.left = new Node(20);
        root.left.right = new Node(1);

        maxpathSum(root);

        System.err.println(maxSum);
    }
}
