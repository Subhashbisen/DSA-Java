// 112. Path Sum leetcode
package BinaryTree.problems;

public class pathSum {
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

    public static boolean haspathSum(Node root, int target) {
        if (root == null) {
            return false;
        }

        if (root.left == null && root.right == null) {
            return target == root.val;
        }

        return haspathSum(root.left, target - root.val) || haspathSum(root.right, target - root.val);
    }

    public static void main(String[] args) {
        Node root = new Node(5);

        root.left = new Node(4);
        root.right = new Node(8);

        root.left.left = new Node(11);

        root.right.left = new Node(13);
        root.right.right = new Node(4);

        root.left.left.left = new Node(7);
        root.left.left.right = new Node(2);

        root.right.right.left = new Node(5);
        root.right.right.right = new Node(1);

        int target = 22;

        System.out.println(haspathSum(root, target));
    }
}
