// 111. Minimum Depth of Binary Tree leetcode
package BinaryTree.problems;

public class MinimumDepthofBinaryTree {
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

    public static int minDepth(Node root) {
        if (root == null) {
            return 0;
        }

        if (root.left == null && root.right == null) {
            return 1;
        }

        int left = minDepth(root.left);
        int right = minDepth(root.right);

        if (left == 0) {
            return right + 1;
        }

        if (right == 0) {
            return left + 1;
        }

        return Math.min(left, right) + 1;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        root.left = new Node(2);

        root.left.left = new Node(3);
        root.left.right = new Node(4);
        System.out.println(minDepth(root));
    }
}
