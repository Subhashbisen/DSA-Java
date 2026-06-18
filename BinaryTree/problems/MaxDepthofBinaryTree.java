// 104. Maximum Depth of Binary Tree leetcode 

package BinaryTree.problems;

public class MaxDepthofBinaryTree {
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

    public static int maxDepth(Node root) {
        if (root == null)
            return 0;

        int left = maxDepth(root.left);
        int right = maxDepth(root.right);

        return Math.max(left, right) + 1;
    }

    public static void main(String[] args) {
        Node root = new Node(3);

        root.left = new Node(9);

        root.right = new Node(20);

        root.right.left = new Node(15);
        root.right.right = new Node(7);

        System.out.println(maxDepth(root));
    }
}
